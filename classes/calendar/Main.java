package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;
import sif.servlet.Servlet;
import sif.servlet.HTMLServlet;
import sif.servlet.Request;
import sif.servlet.SessionState;
import sif.servlet.SessionPrincipal;
import javax.servlet.ServletException;

/**
*   Entry point for calendar application, which should be the place where
*		- Fabric nodes instantiated
*       - Servlet instantiated
*       - A calendar object created
	(Looking at travel.customer.CustomerMain.fab example)
*/
public final class Main extends sif.servlet.HTMLServlet {
    static final fabric.worker.Worker worker$ =
      fabric.worker.Worker.getWorker();
    fabric.worker.Store _localStore;
    fabric.worker.Store _store;
    fabric.lang.security.Principal _servletPrincipal;
    
    public calendar.Main calendar$Main$()
          throws javax.servlet.ServletException {
        this.jif$init();
        {
            fabric.worker.Worker w = fabric.worker.Worker.getWorker();
            fabric.worker.Store localStore = null;
            if (!fabric.lang.Object._Proxy.idEquals(w, null)) {
                localStore = w.getLocalStore();
            }
            this._localStore = localStore;
            this._store =
              fabric.worker.Worker.
                getWorker().
                getStore(
                  calendar.Config._Static._Proxy.$instance.
                      get$calendarStoreName());
            fabric.util.Map root = null;
            if (!fabric.lang.Object._Proxy.idEquals(this._store, null)) {
                root =
                  (fabric.util.Map)
                    fabric.lang.Object._Proxy.$getProxy(this._store.getRoot());
            }
            {
                fabric.util.Map root$var8 = root;
                fabric.worker.Store localStore$var9 = localStore;
                fabric.worker.transaction.TransactionManager $tm14 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled17 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff15 = 1;
                boolean $doBackoff16 = true;
                $label10: for (boolean $commit11 = false; !$commit11; ) {
                    if ($backoffEnabled17) {
                        if ($doBackoff16) {
                            if ($backoff15 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff15);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e12) {
                                        
                                    }
                                }
                            }
                            if ($backoff15 < 5000) $backoff15 *= 2;
                        }
                        $doBackoff16 = $backoff15 <= 32 || !$doBackoff16;
                    }
                    $commit11 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        if (!fabric.lang.Object._Proxy.idEquals(root, null)) {
                            calendar.Calendar calendarInit = null;
                            fabric.lang.Object
                              obj =
                              root.
                              get(
                                fabric.lang.WrappedJavaInlineable.
                                    $wrap(
                                      calendar.Config._Static._Proxy.$instance.
                                          get$calendarMapKey()));
                            if (calendar.Calendar._Impl.
                                  jif$Instanceof(
                                    fabric.principals.ServletPrincipal._Impl.
                                        getInstance(),
                                    obj)) {
                                calendarInit =
                                  calendar.Calendar._Impl.
                                    jif$cast$calendar_Calendar(
                                      fabric.principals.ServletPrincipal._Impl.
                                          getInstance(),
                                      obj);
                            }
                            this._servletPrincipal = calendarInit;
                        } else {
                            this._servletPrincipal = null;
                        }
                    }
                    catch (final fabric.worker.RetryException $e12) {
                        $commit11 = false;
                        continue $label10;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e12) {
                        $commit11 = false;
                        fabric.common.TransactionID $currentTid13 =
                          $tm14.getCurrentTid();
                        if ($e12.tid.isDescendantOf($currentTid13))
                            continue $label10;
                        if ($currentTid13.parent != null) throw $e12;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e12) {
                        $commit11 = false;
                        if ($tm14.checkForStaleObjects()) continue $label10;
                        throw new fabric.worker.AbortException($e12);
                    }
                    finally {
                        if ($commit11) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e12) {
                                $commit11 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e12) {
                                $commit11 = false;
                                fabric.common.TransactionID $currentTid13 =
                                  $tm14.getCurrentTid();
                                if ($currentTid13 != null) {
                                    if ($e12.tid.equals($currentTid13) ||
                                          !$e12.tid.isDescendantOf(
                                                      $currentTid13)) {
                                        throw $e12;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit11) {
                            {
                                root = root$var8;
                                localStore = localStore$var9;
                            }
                            continue $label10;
                        }
                    }
                }
            }
        }
        return this;
    }
    
    public void initialize() throws javax.servlet.ServletException {
        this.addStartAction(
               (calendar.FrontPage)
                 new calendar.FrontPage().calendar$FrontPage$(this));
    }
    
    public java.lang.String getPrivateHostID()
          throws javax.servlet.ServletException {
        return "";
    }
    
    public java.lang.String defaultActionName(final sif.servlet.Request req) {
        return "frontPage";
    }
    
    protected sif.servlet.SessionState createSessionState(
      final fabric.lang.security.Label lbl, final java.lang.String id,
      final sif.servlet.SessionPrincipal session) {
        {
            fabric.worker.transaction.TransactionManager $tm22 =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean $backoffEnabled25 =
              fabric.worker.Worker.getWorker().config.txRetryBackoff;
            int $backoff23 = 1;
            boolean $doBackoff24 = true;
            $label18: for (boolean $commit19 = false; !$commit19; ) {
                if ($backoffEnabled25) {
                    if ($doBackoff24) {
                        if ($backoff23 > 32) {
                            while (true) {
                                try {
                                    java.lang.Thread.sleep($backoff23);
                                    break;
                                }
                                catch (java.lang.InterruptedException $e20) {  }
                            }
                        }
                        if ($backoff23 < 5000) $backoff23 *= 2;
                    }
                    $doBackoff24 = $backoff23 <= 32 || !$doBackoff24;
                }
                $commit19 = true;
                fabric.worker.transaction.TransactionManager.getInstance().
                  startTransaction();
                try {
                    if (!fabric.lang.Object._Proxy.
                          idEquals(this._localStore, null) &&
                          fabric.lang.security.PrincipalUtil._Impl.
                          equivalentTo(
                            this._localStore.
                                getPrincipal(),
                            fabric.worker.Worker.
                                getWorker().getPrincipal()) &&
                          fabric.lang.security.LabelUtil._Impl.
                          relabelsTo(
                            lbl,
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        worker$.getPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.topInteg(
                                                                         ))) &&
                          fabric.lang.security.LabelUtil._Impl.
                          relabelsTo(
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      bottomConf(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        worker$.getPrincipal())),
                            lbl)) {
                        return (sif.servlet.SessionState)
                                 fabric.lang.Object._Proxy.
                                 $getProxy(
                                   ((sif.servlet.SessionState)
                                      new sif.servlet.SessionState._Impl(
                                        this._localStore).$getProxy()).
                                       sif$servlet$SessionState$(id, session));
                    }
                    return null;
                }
                catch (final fabric.worker.RetryException $e20) {
                    $commit19 = false;
                    continue $label18;
                }
                catch (final fabric.worker.
                         TransactionRestartingException $e20) {
                    $commit19 = false;
                    fabric.common.TransactionID $currentTid21 =
                      $tm22.getCurrentTid();
                    if ($e20.tid.isDescendantOf($currentTid21))
                        continue $label18;
                    if ($currentTid21.parent != null) throw $e20;
                    throw new InternalError(
                            "Something is broken with " +
                                "transaction management. Got a signal to restart a " +
                                "different transaction than the one being managed.");
                }
                catch (final Throwable $e20) {
                    $commit19 = false;
                    if ($tm22.checkForStaleObjects()) continue $label18;
                    throw new fabric.worker.AbortException($e20);
                }
                finally {
                    if ($commit19) {
                        try {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().commitTransaction();
                        }
                        catch (final fabric.worker.AbortException $e20) {
                            $commit19 = false;
                        }
                        catch (final fabric.worker.
                                 TransactionRestartingException $e20) {
                            $commit19 = false;
                            fabric.common.TransactionID $currentTid21 =
                              $tm22.getCurrentTid();
                            if ($currentTid21 != null) {
                                if ($e20.tid.equals($currentTid21) ||
                                      !$e20.tid.isDescendantOf($currentTid21)) {
                                    throw $e20;
                                }
                            }
                        }
                    }
                    else {
                        fabric.worker.transaction.TransactionManager.
                          getInstance().abortTransaction();
                    }
                    if (!$commit19) {
                        {  }
                        continue $label18;
                    }
                }
            }
        }
        return null;
    }
    
    protected sif.servlet.SessionPrincipal createSessionPrincipal(
      final java.lang.String id) {
        sif.servlet.SessionPrincipal p = null;
        {
            sif.servlet.SessionPrincipal p$var26 = p;
            fabric.worker.transaction.TransactionManager $tm31 =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean $backoffEnabled34 =
              fabric.worker.Worker.getWorker().config.txRetryBackoff;
            int $backoff32 = 1;
            boolean $doBackoff33 = true;
            $label27: for (boolean $commit28 = false; !$commit28; ) {
                if ($backoffEnabled34) {
                    if ($doBackoff33) {
                        if ($backoff32 > 32) {
                            while (true) {
                                try {
                                    java.lang.Thread.sleep($backoff32);
                                    break;
                                }
                                catch (java.lang.InterruptedException $e29) {  }
                            }
                        }
                        if ($backoff32 < 5000) $backoff32 *= 2;
                    }
                    $doBackoff33 = $backoff32 <= 32 || !$doBackoff33;
                }
                $commit28 = true;
                fabric.worker.transaction.TransactionManager.getInstance().
                  startTransaction();
                try {
                    if (!fabric.lang.Object._Proxy.idEquals(this._store,
                                                            null) &&
                          fabric.lang.security.PrincipalUtil._Impl.
                          equivalentTo(this._store.getPrincipal(),
                                       this._servletPrincipal)) {
                        p =
                          (sif.servlet.SessionPrincipal)
                            fabric.lang.Object._Proxy.
                            $getProxy(
                              (sif.servlet.SessionPrincipal)
                                fabric.lang.Object._Proxy.
                                $getProxy(
                                  fabric.lang.security.DelegatingPrincipal._Impl.
                                      $addDefaultDelegates(
                                        ((sif.servlet.SessionPrincipal)
                                           new sif.servlet.SessionPrincipal.
                                             _Impl(this._store).
                                           $getProxy()).
                                            sif$servlet$SessionPrincipal$(
                                              id))));
                    }
                }
                catch (final fabric.worker.RetryException $e29) {
                    $commit28 = false;
                    continue $label27;
                }
                catch (final fabric.worker.
                         TransactionRestartingException $e29) {
                    $commit28 = false;
                    fabric.common.TransactionID $currentTid30 =
                      $tm31.getCurrentTid();
                    if ($e29.tid.isDescendantOf($currentTid30))
                        continue $label27;
                    if ($currentTid30.parent != null) throw $e29;
                    throw new InternalError(
                            "Something is broken with " +
                                "transaction management. Got a signal to restart a " +
                                "different transaction than the one being managed.");
                }
                catch (final Throwable $e29) {
                    $commit28 = false;
                    if ($tm31.checkForStaleObjects()) continue $label27;
                    throw new fabric.worker.AbortException($e29);
                }
                finally {
                    if ($commit28) {
                        try {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().commitTransaction();
                        }
                        catch (final fabric.worker.AbortException $e29) {
                            $commit28 = false;
                        }
                        catch (final fabric.worker.
                                 TransactionRestartingException $e29) {
                            $commit28 = false;
                            fabric.common.TransactionID $currentTid30 =
                              $tm31.getCurrentTid();
                            if ($currentTid30 != null) {
                                if ($e29.tid.equals($currentTid30) ||
                                      !$e29.tid.isDescendantOf($currentTid30)) {
                                    throw $e29;
                                }
                            }
                        }
                    }
                    else {
                        fabric.worker.transaction.TransactionManager.
                          getInstance().abortTransaction();
                    }
                    if (!$commit28) {
                        { p = p$var26; }
                        continue $label27;
                    }
                }
            }
        }
        return p;
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512018554000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "52Bq+WVP1dI/HnkIT/2MXtZ7Cg5Jgo6cB1dsi8l+N4HJoEdsedwaWx53R0PH3dEQjuWfZoY+x93R0HFbNJTBwrlI+a8ek3JmjqSEHrO74XC3q8yNxtB7bi76wQg5r3f0X9gD+nuZ9oDFtHtfRweMnRePefplrcymXfu6pj3Tb7X0KCj1n9trFAAavzjvX9qj8eCVeZnDv8LRy+Jv/fDFHD/05fCidVZzTWZ2m2trYy7m+qIemGuhd+Y60mtzDYKXwVxflPAw1/4GKDqRQ5mU2Y8J5xF9DJyDDuR1/V7j2vvimwfdCepW2/mgv9l6uR2a6QXyZnin5cIwCuBfb5C5JxfV/T8wmJr9orrOMOMOuf8yfJV1Xwr6Yyiy1kpnAIatMj9sQ/nVrMxDcL+G8+FA+KYxi1ZtNrXK0xXoC0AcVCsL7DNlNfLMELgdKaikQXXywckIR1PIGMv/E4Pqeh8LI8ymRDZHmoOQG8T/j26Ib958dJE/y06Qf0eO5Ifirt4sISe+wOOuXJSHEf/u3vFsTw94RsxLHnytHDbzx3r8Dif7VVix+llp11/PO700w29wjnL9Mi+Du3/H4MKRO1a8jt/NMn7xdRD7SRrrT25YnvPjqhSRkWaDsBwWR8R+rXGF+pfh4fNDiMME5GLECCBKgJbwNZwBRO0Xs/osjbuwT7dcF7csbWBXttmW7jc6PuJPf3JiDMmvrCfKlp743uO2AEqzb73HlwigfYNBuknw+kxGsgtYXQ9TP4om6TF2m9//lLeV/XZu8/sPolCgA/0NIHANotHbW/bQHy5O+Z+Ip2msM9GqwN4G5Q/2X4+Eb+Gn6G9ch8T/nTmj5olDUw6yX0TL+H0RE2LvjiXLLv54Dv29yX6iImzE640DG7gC6uZxDfDjmhMzjqaPlb+4/PNB+4pONX6WEIqRlvMfG3aWnyfwOsuz/QR3SLxzwUtfHGxPPE+sQCtXYliB6g5JXCeFvY73HAOs4zZd/+zmoZcRRFu5IjnZoqaSGvyadpGofxMF2LERl7soTgPEt8jiprlOOW0j2444D6Tiu3bln7qa0n+q8xfpbGDm+aZv7bblDQUnV5u/T4UxA/tpiglxmwpxqEJoadL/D2u19j9AXgAA";
    
    public void initialize_remote(
      final fabric.lang.security.Principal worker$principal)
          throws javax.servlet.ServletException {
        if (fabric.lang.security.LabelUtil._Impl.
              relabelsTo(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.bottomConf(),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal)),
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.principals.ServletPrincipal._Impl.
                                getInstance(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()))))
            this.initialize();
        else
            throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                    );
    }
    
    public java.lang.String getPrivateHostID_remote(
      final fabric.lang.security.Principal worker$principal)
          throws javax.servlet.ServletException {
        if (fabric.lang.security.LabelUtil._Impl.
              relabelsTo(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.bottomConf(),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal)),
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal),
                      fabric.lang.security.LabelUtil._Impl.topInteg())))
            return this.getPrivateHostID();
        else
            throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                    );
    }
    
    public java.lang.String defaultActionName_remote(
      final fabric.lang.security.Principal worker$principal,
      final sif.servlet.Request req) {
        if (fabric.lang.security.LabelUtil._Impl.
              relabelsTo(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal)),
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            worker$principal),
                      fabric.lang.security.LabelUtil._Impl.topInteg())))
            return this.defaultActionName(req);
        else
            throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                    );
    }
    
    public Main() {
        super(fabric.principals.ServletPrincipal._Impl.getInstance());
    }
    
    public void jif$invokeDefConstructor()
          throws javax.servlet.ServletException {
        this.calendar$Main$();
    }
    
    private void jif$init() {  }
    
    public static boolean jif$Instanceof(final java.lang.Object o) {
        return o instanceof calendar.Main;
    }
    
    public static calendar.Main jif$cast$calendar_Main(
      final java.lang.Object o) {
        if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
        if (jif$Instanceof(o)) return (calendar.Main) o;
        throw new java.lang.ClassCastException();
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512018554000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "0Ql/gvAB4cUeIzF9RSiGitF9nCgWiQ9ynhsRH9QALZcY4TSBk26JcIIFMbPlqmPAVUczOagksQGdWH3oErQZdgAZrNrAcgLt0islA5HZfIvaPSmtz6CnTwdVi8OVWJJi9wCtztJ+Pcbt/NibmnRoGH+Mdiu9weesWiUHbKnTa5Ci0LqS1767xyvyCBC+3/ZzVtJQcW/asg8dRB7B6YHUo93ckEF24wv1fLRQfLUdOGnSmUuwnoKeGmFH0N+k3Zze90cXzufSdPqNc6rsq6K3MiqndzvKqQgVZDhvUSPLjaT3eZOwVqYCutAbtrPG9kPl+dkSkcczq8AEwnqVMmx6KD8J/tLKTodF1216Wp0zOhmK6qXwVttdtch1x5iOhZh+OoT90iQ3ow478XFUsg1KBUbktlK7QecSl9Y6omwW/ulU5J1FeReX3Mt0ywlyN6KnGLDdvR3ThV+MSws8bYx8d55XaVCKmXnSd7h3VmWW9+JAH9Klncfdfue5lLslAcNwWXo1lwk8iPE9NS8W0IkZhHZoiBrYlSu3tmjogjqI0jECO2ez6TCvXnYWe6kmX75xVrK835olnHP+lpYvA14y9Z44+T5vGchkN9cw6e64jb/t2hKitri6ctmhKHFt5Zqbxt1bxa7RLdmRi9NxB3ib0N8sgEJgVodzBWmSMPf4yyYmSRJFB6RfNMNKsYsiQo4gTVjxuFzgLHaYonIhJwV6sXGJAriwdSrCPCPmFett7cNqieWr85nb4l2KTT/Fi63FQZ/vXFQI5nC+P7MyVSSHRVJbiDasIJz0dMLueDWtzsDFQ1olm2ynsjbXXrA+rfYbAVVzcT85cNsMqCnGWlqUPtDxEoNtGBylEnCR6Yg7h8BtXNeIFiC+sz0gAco3rr4fKJTGxxzeEwsXBuuBsqdTu8mVO3htl9qOLaVojfOcBJ/cBiGlpKVC+HLI3H3MtmQBmMAIeGC4mGDWLg7QchgcB/N1eeFhgjgdfL+frOsp3YYkExhsS7gdicp79YzBSd9bW3xIsct5SQhbaKBAfWeP9OU04mO6OYUmbNWw2HiUaQUOLnqsQ87Tcp7tXBAJgKW1oYjxTKN1tuk7c25IAz+ahENVJwCgLuwcRzZCGzfEkOptzbt+qFWbfcXaRwps3N7R9FxTVQzUnU4AloJyDrjSpKqNFh5sSfcaPHesOSYVa7gfOM2y4+ViH7WUeGmqpT4dtNZ4r0cAtlkbeFacdgRPOzB6UiS9nM70GITufUMMlmMe9VMwMs+QBMlRMKbtEs7SfAjBSctp5JRJU7BJ8KILMUUBXpQKb5KYMFYAFdrOicnl1dbIR3zZjRKyixXLCHVg5JvMAEalDMWwFMg+P3XeEbDJqsWpcH8u8QE9rszQxhqpFsNBOR3XFAWeWZXqa3XLejRzzqn1Hoo2+xZa7p0zxJ8hrE1EKA9YqY/s5fGQVMUycm2byVSa0VYqyLL85eIoByrxfGjF4H64ItCUO6uXbC3AXEc0xxUPb9YnbrnoVM+vzAgsNovMT5ytcck1UdKXaEoFdBIIwWUDDwTXLn16D+UNpPYibWKg5xS9fFH7HS4nqp75AmopzQJN4H5fm41tuasGQytAw+YO0lBQw1cJZRuCyQclVApqkS63hF3VZr4h+aE/yn17kueLyV0bhe8H5+MelzGrW0Nxb9cIvC7pEjZgQ9G6wvEADzK20Uh6bqSRYYoiDKQwRISlTlRXi8kiVUR+2o5JXyx2CqgUjekKVnT9+99gCmEhE1rvtEOkR1wbWw7RoHR0XMQqhLpenRyoQMXtM6NH29TpvekoKY2Jk3dytdz0F4n2YjM/Y45yFveA52942bSUpCY5lwn9Oj1I5dW7phvYXRwmxS9x2R8WC5QkRWle93lZGpC+6AedOZISjBPVej4OrgkCUZkC5pomRzjbkDa9JsT5hYXP8B7aakjpzZHTKBaHPQKG4/Eg9ysm5AjzHAiIIgec1bRJLxBrwwIpCdg0rWyf2ja0CDpHdC++QMy4bwNkqLOko7IAzArDBtrAnfxNvV7bbhJGwpZcqd7lop2aKOQ0eukrWbGy996BFuGc3C08oXQpcI4seCbNexE/HxmOai+NM1dLDtkfPXlljbAkbaUuGSVXMNbldLx18HMjHrtW6tLSStjNKiv94XSYL4g9G0W9NnDqemPH+zRQe5gIjxLBLQkGvrCdcub2kMQuPZSn9MAu8w1kdCcTFxZVzq6mMw+huJCjwHMci0LR3axOtpARjc/tckxsQezoBGAQKOTJMRZjZds9E1euutEccH1xm3a7m/SUO+gmbUGR7kdgCFt2BM69FA+ki6VrxyJsK5ngs0agg/UQbLfdfAqj0hxo5qHRrwke5neMWx9jigzQkNdEzsJUtWcnMebosCngKS6ubc5XKG1LnpOVg+pMizqTVDsiKemHmHWq6Yzq4oDqL3rbpcJTZGIOE8SON+xPWI5124qgVQO4aF1E9aImeeNlkIONR9BwGeUjk5rqRRX9It6j5oVJSj7SDGUvyaB+kSlj07CBnOg24cG8j8k9bcER3e1h4WIf/cgtFJDnqs10oNMpAmx5Vtsdh4OdJMUco5mmCCEvOMKEDUYc4Dln3bdLMNl4EQVqc4CiNSDrmbM07kIDdolk3NR6J6H4mVuRaVcaiuuc6Hm5OSmAWqhkdmSRI8VPR2F5XcqySLpp4PDVMCL6ouKbs2AZu8y4WEuhF4kaW6+AyCBlLREPQHe2pSBr5kuP4iJw4boZnDAQRfn4xcyoLeSs2k4MGJDbATFybsg5fGa2Wj8yKORkAsNFFi4j803X8AGgWeHGxhDcAgUZd/wDMczbGu7PMbXjJgcrhJ557MM5vzrPS3JZkcMWgBmt6+FgLzrSONDXVIDyPhfio7cUjtfTkO9SIK59X3tW7sDbTxiyrADL3MK+APJ5IuggsrFbB18dMfFYLLwl7DcRkQIyyosF4zeBP7jWiE0n8C0/9xk17qzQKfbASE5NPHuQRX051KkAuESQzMUsrnYMXys4al8N4Fke2yV+iPDFoB6xeh5CNnmkgbxzyIJmW74NtSHY5FqwDcIyrb1zZofdoozn+gG3ofUqnrS+rVmKcvvLZIPJKiaClRk4Od0TknYGpiNMSLM8DUJYuIp807noloNkSFvvz3gGVEKQcd3JB/aL6Yh+ofdrezDHMN1SAwyi3JquNBXLDGRPiNjIkrR4pulOg0ETj5G+j7Ih9FdBaSFgduzJdNFpiLtQ7bOTRznmCcOqW4YHbIWJY2iCOjFkYk0Wda1spj9dSJxD0YTtoV7sz9EZTsqcEtx2igQbFczNejPSngRwBMBSwHo/RrDTyrW9hka7WEGUZ64aCaflVA6lDSMd/bUbJaptnwcvETR4K3CbHmTQbRWcCEkgzplGO3xWKCpH6GCMLIQDiRG+yIBnaKGGUKBgQhjVLdoIuwAYFKWzxR3PhGA379lGH0hUa0aJz88tTx8u47wm6CjETTMagTQtYRjcKjgEDQg5xLlEbiKA7uYgj27WmjLpXdyC8ibHR1+j8Z1WT4E+ts/7bVyddlpiuXSzHCyN0IDJELFAGZ7QUKajzYbBOIlZrZbro3gYZGdYagpkN2DRxIdu0HHfY3GvOVhLu20zC4+9xbYTt+FcjOhN1tercJ2WODrvFIRiqssBn/PpEB3D6TTaJfkAJCPXHNu9rZL6Fi2yhc4iGQmCqRSYoO10BNhsi3Q1RXaQLPCUXLT8wQIPKn/GFMABhBLJmg3JVYOMcpgKIjYKMAeAyxcc6Z0mGud6FmNFShvD4mxDugTwkMYgUh9HtiT1GEr3CHm2F5GQXZgFCtEcflwtOmekQzrOTpvL5Ae26QFAwa28BNBSke2FxQiVlvabkJu7Vn6ewrCmu4CqNt9Jk8k12pDnxu2WARp11dr7NFouJp21VwHb7yfkKaVBL44PApdsCk40je0wIc6dopoOL/3Z9UuuCMcNi0iMluJNoR+3TEvEUVmnimJBMYKiKL3Qo25+SHO8cqEcqIgxLA8cnQGu0+OHQzq5gdzEOlBHjZEC2zI6pmM2lGPFiIXrSyCNdDAZk9QUL1NXk9Pc26iPPctGvQo/tlLjc9IeX09b+yPj6+l5t99775PpmfuafCI974nc0tk1TetTz7v3cEvR+vaf+ObP+spfgF+8T1DN2tnLbVH+UBr0QfrEUu+7Jny96V7N5nbb43G26a/95qfIVfL3j3cJX595auenR//Hm+/8Mvc570+/OHvb62mlb7pi8sZJX35jMum766Dt6lx/Q0rpg9dp9a4rDd4/Pa9MNPon9/U/ejKV8bGT+Ny1+MHXp74wu0+FvE753fv6/36azM9O8v2xp/peuE+xf5T4eE34Gx/e50U+3N3VzOgF5aMs7Fdu6/zEtfjj7ez9j1LAX72mgL/6GOY/9kZMr1ct6NnspW/f19/6/WF6nfLN+/obvzdM/91nY3r9/LduA/7Mtfi32+uVoqi9XW+6y3uN7rMIr9XE9bf3ReQ/C6Vr1qs4gYfe15/6/aF0nfLJ+/pjvzeUfuZ7ofTnrsVPt7MPHm9Jrb3bBnzRtMItLPnas5B4MD3KBMG/cV8nvz8krlPi+9p/PhJPSdlHpiPE6zKmBVUX3KXM34nWX3wLCvz8tfjz7exDfhC6XdpSt5R4+V7rnsbwql6z+fSYE7bWfY08B8NnJVCXddEGXhv4j23cDZb33a8F39effz7qb7vL8n2E+ivPzCyW3EPwFlnFX3s0+5NPEm4XNNek4DdlJT9x0+Y2+z97C3p+91p8p5192KuDSVjul7zeCHw9P/wTz9jz8YA37vcs+mPTk8xm7/7J+zp6Cwn7xTeT+TrldF+/9j0l7Eat26q/9BZY/3fX4r+anN8bsH6dkNfe/+JZyvL9j0T/uUbsWnzj+aBZt1H/4/dS479+LX5lkvLHlum1OsgmWbx2fOt5xugRaM82Rtfi3/9eoP3N7wXa37oW/3M7+/jTFuYJAJ9raB4B+GxDcy3+w6f2f/FxsGFdi5+7Df07b8HbX70Wf3sS2zdZiLeA8Hav4HNPQHir2xdefv6tqf/fL1h94UsPqs5toqqbkPr83c2lB1df9SCOwlejvC+SgA7CJ+67ff4LD24XzZoHX3nasf+Imx2+/lX9wY+0p6h5+Eaf/vkvfPnrXyjL53uD2++lp6l37f17ZfkWrPoH30vYfuNa/B8TL5+H0XPV4UNv4uXsl//F4eWdXj3JzKidmPcjD77y1d2Dp3nxDL/1zvsVnorM3/ksFv32W7LoH75F3+9ei99sZ+96BOKzuHFzAZ96s2Z94l8Ybtxd7npwr2CHokgDN7+x5VHgX4Sf/8rt5teDa/R8U6Wbf797u7ucdnt/UHyVndh4dzB48PniQfT6Cg+uYLxZ0Z5/7Prh+1uKz1ShZ9wQugPj2n4XZf3T53P2hZsK/uMpuH8jls+Kjt95T5An2f7ohuonHrH7UcO199U/EASvn//sBut73gKP632gF166HnInPDy3aV99xPXXruS+gTFOEf7143qp8g8941b1/R1/b/VfB9/+++svft9zblR/4k3/68L9vF/42Q+86+M/a/yvt1vDr9/ff1mavSvs0vTJy4dPvL9U1kEY3Qjw8t1VxBvRXvjwpG2PULh+3/nPVx6x++NPhmq8vpHuzfxjrr/S1df/JuI7//Dj/+9L79J/7f4a1+zBj/z3f8P+S3/v5/6vv/2v/z+/88t/8X/6rZ/+9a/8wq984jOv/Maf/9W9+GH/z/1/tm+Z7L5CAAA=";
}

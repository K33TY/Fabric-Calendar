package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import javax.servlet.ServletException;
import sif.html.*;
import sif.servlet.Action;
import sif.servlet.Request;
import sif.servlet.HTMLRequest;
import sif.servlet.Servlet;
import fabric.util.Map;
import sif.servlet.HTMLServlet;
import login.*;

public class FrontPage extends calendar.CalendarAction {
    static final fabric.worker.Worker worker$ =
      fabric.worker.Worker.getWorker();
    
    public calendar.FrontPage calendar$FrontPage$(final calendar.Main m)
          throws javax.servlet.ServletException {
        this.jif$init();
        {
            this.calendar$CalendarAction$();
            this.initFields("frontPage", m);
        }
        return this;
    }
    
    public final void invoke(final fabric.lang.security.Label lbl,
                             final sif.servlet.Request req)
          throws javax.servlet.ServletException {
        try {
            sif.servlet.HTMLServlet servlet = (sif.servlet.HTMLServlet)
                                                this.getServlet();
            if (fabric.lang.Object._Proxy.idEquals(servlet, null) ||
                  !calendar.Main.jif$Instanceof(servlet))
                throw new javax.servlet.ServletException(
                        "No servlet available");
            if (fabric.lang.Object._Proxy.idEquals(req, null))
                throw new javax.servlet.ServletException(
                        "No request available");
            calendar.Main main = (calendar.Main) servlet;
            {
                fabric.worker.transaction.TransactionManager $tm12 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled15 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff13 = 1;
                boolean $doBackoff14 = true;
                $label8: for (boolean $commit9 = false; !$commit9; ) {
                    if ($backoffEnabled15) {
                        if ($doBackoff14) {
                            if ($backoff13 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff13);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e10) {
                                        
                                    }
                                }
                            }
                            if ($backoff13 < 5000) $backoff13 *= 2;
                        }
                        $doBackoff14 = $backoff13 <= 32 || !$doBackoff14;
                    }
                    $commit9 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        if (fabric.lang.security.LabelUtil._Impl.
                              relabelsTo(
                                lbl,
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
                                            req.session,
                                            fabric.lang.security.PrincipalUtil._Impl.
                                                topPrincipal())))) {
                            this.loginToServlet(req.session, req);
                        }
                        if (fabric.lang.security.LabelUtil._Impl.
                              relabelsTo(
                                lbl,
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
                                            fabric.principals.ServletPrincipal._Impl.
                                                getInstance(),
                                            fabric.lang.security.PrincipalUtil._Impl.
                                                topPrincipal())))) {
                            servlet.
                              createPage(
                                (sif.servlet.HTMLRequest) req,
                                "Home Page",
                                lbl,
                                lbl,
                                new sif.html.NodeList(
                                  lbl,
                                  lbl,
                                  lbl,
                                  lbl,
                                  calendar.CalendarAction.
                                      createBanner(
                                        lbl,
                                        "Fabric Information Flow Calendar"),
                                  lbl,
                                  lbl,
                                  calendar.CalendarAction.createBody(lbl, lbl,
                                                                     null)));
                        }
                    }
                    catch (final fabric.worker.RetryException $e10) {
                        $commit9 = false;
                        continue $label8;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e10) {
                        $commit9 = false;
                        fabric.common.TransactionID $currentTid11 =
                          $tm12.getCurrentTid();
                        if ($e10.tid.isDescendantOf($currentTid11))
                            continue $label8;
                        if ($currentTid11.parent != null) throw $e10;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e10) {
                        $commit9 = false;
                        if ($tm12.checkForStaleObjects()) continue $label8;
                        throw new fabric.worker.AbortException($e10);
                    }
                    finally {
                        if ($commit9) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e10) {
                                $commit9 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e10) {
                                $commit9 = false;
                                fabric.common.TransactionID $currentTid11 =
                                  $tm12.getCurrentTid();
                                if ($currentTid11 != null) {
                                    if ($e10.tid.equals($currentTid11) ||
                                          !$e10.tid.isDescendantOf(
                                                      $currentTid11)) {
                                        throw $e10;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit9) {
                            {  }
                            continue $label8;
                        }
                    }
                }
            }
        }
        catch (java.lang.ClassCastException exc$0) {
            throw new fabric.common.exceptions.ApplicationError(exc$0);
        }
    }
    
    private final void loginToServlet(
      final fabric.lang.security.Principal session,
      final sif.servlet.Request reqParam) {
        final sif.servlet.Request req = reqParam;
        final fabric.lang.security.DelegatingPrincipal p =
          fabric.lang.security.DelegatingPrincipal._Impl.
          jif$cast$fabric_lang_security_DelegatingPrincipal(
            fabric.principals.ServletPrincipal._Impl.getInstance());
        if (fabric.lang.Object._Proxy.idEquals(p, null)) return;
        final fabric.lang.security.Principal sessionLow = session;
        if (fabric.lang.security.PrincipalUtil._Impl.
              equivalentTo(
                p, fabric.principals.ServletPrincipal._Impl.getInstance())) {
            p.addDelegatesTo(sessionLow);
        }
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512037269000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "I7xurWM5nM5pNVP3wj9tH/n0UvfCofb3fwWIpNn+r/ASFBug+EYryeomBr4KxYZ2d2ehuCHXjVe895zEgCJzl9ySHqoG0C7IAJqqZZWUoCXQT1g6xN0r2LwN5jPDlJ11Ofpj2fxI6H0TCskm0/hluBGt/wrLPkz9AxNE6w2Xs7Z4sjlaP+NVCebfbyFtvkdx1uy5jbRtNIPdT9Noah2JfKcZx+C40zOOltQ4bGOwrB3baNtD29IFJ5+JpQMewu077MUzNGvB4n87szbjTM1a5X/N2n/N2mdq1qr+dc1aUyeYtZbTNWtap5s18bMxaxagm21Ab3ECisCtwi6QcApstaOkwPYzFr8OuLbdn2s7rQRs9v5ooe9MOxi1O+vxLSjutme914k/Vrd7Jit4K1Z0fCYLfv3QQb4HO1F72QkpJ6k+C13c1Qm6ePfp6uJ9naSLBimU8AhsRIP0dPA2jKiCkBn3Ocfboc5c8h+rM5/MFWo1vZmnmDz6gBFA8mZPFOS1cj8JeYC5syBuKQafys6kbIoN3W5B9YVi+3+0Xv6uE/TyxdPVyz923hoZfACKp5lCCqenkNYJbuH9TtdIAOcvp6eVnpzTTobf6zmqJrQ9eXbV861OVU/cMQ++dXrqaR5O7Xz9hKHez4lhD2YwzJnozAtkpdKnkejMyz89hfZNdOb1OE2Nzut9JhptMpWqNBKQEqDQ9RnVc3y+rc6/+S9V/ELe/ZcrJg7I8l31wRn/7wLvd//O3l0H7ax/AT8WbH12tBf/FKzza6OO+3zKhxi+xEN6seMzaHjyBhukq/k5T/g9BN33kYjrUIMMsj71aX5bfoZkfjpnZJrtgo0641NB2ND3XEBesfvr0fAxthT7by0i0j/PnzzrZwfG7ufv8mb96ILdY+/OqvnXvDGFfW+6ixQXV6+GSXtWkwIW1yIM8AHtUVlHM8fKnzP+/V4PFI6xPpkMxSDHGXLXN/Acn7Pze+nR9b9uRKRvX3bog/1NrU9T0WggfSzRqGiWpRVy1O8NTs8AK8iaG3+xsWg9vrRWqCTr9FTSgP9Ao1AyP+cALOrHXlXTmO5MoMBNyHiR1TWy6y3WfSlt9+78MVcy+p/r/Vikq5v9YkZg+e0Lqgs+vrL996lxT2sA23EfyRTSeogfuMC3UNL/DywVD9FHZgAA";
    
    public final void invoke_remote(
      final fabric.lang.security.Principal worker$principal,
      final fabric.lang.security.Label lbl, final sif.servlet.Request req)
          throws javax.servlet.ServletException {
        if (fabric.lang.security.LabelUtil._Impl.
              relabelsTo(
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      lbl.
                          meet(
                            fabric.worker.Worker.
                                getWorker().getLocalStore(),
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
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal())),
                            true),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.
                                writerPolicy(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.PrincipalUtil._Impl.
                                      topPrincipal(),
                                  worker$principal)),
                      true),
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.
                                readerPolicy(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.PrincipalUtil._Impl.
                                      topPrincipal(),
                                  worker$principal)),
                      lbl.meet(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.noComponents(),
                            true),
                      true)) &&
              fabric.lang.security.PrincipalUtil._Impl.
              actsFor(worker$principal, req.session) &&
              fabric.lang.security.LabelUtil._Impl.
              relabelsTo(
                lbl,
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            req.session,
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg())))
            this.invoke(lbl, req);
        else
            throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                    );
    }
    
    public FrontPage() { super(); }
    
    private void jif$init() {  }
    
    public static boolean jif$Instanceof(final java.lang.Object o) {
        return o instanceof calendar.FrontPage;
    }
    
    public static calendar.FrontPage jif$cast$calendar_FrontPage(
      final java.lang.Object o) {
        if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
        if (jif$Instanceof(o)) return (calendar.FrontPage) o;
        throw new java.lang.ClassCastException();
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512037269000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}

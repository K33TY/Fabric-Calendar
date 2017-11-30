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
      "Z7O0sZM1wv+Y61gWJ2tajNS98JblI3cudS+0tb//K0AkzfZ/BTgqL6CfhqnuDG6ibz0UG9rdnYXimmw3XvHedYoCivRdclN6qBog5T9i0hPPKCl+U6AfMXWIui7UubS94Sh8ysxTZgZm6ZVl8iah97WI8HWGCUxzJlr+FRZ/GHqvgaL53sdpW0LZGKat+4LWJjR35qSNtwtOm1W3Jm2ZTn+3TprOeEeC32Um0l/cORNpSo3NQvontGMhLato2Tv/5FOxd8BDuH2bvY6Fxs0//P+bcfOXfUbjBn2BFP7Z/zFr/zFrX6hZm/eva9bELjBrDZ01a6u73Kyt/GLMmonoZgvRG+yIInIJ7AJpJ98WK1by3XbK4tcB127z5tp2Mw2buT+66jvYiU9Gk50ZD3FBsdsa9R77/C13O9PJLD/7rkbHJ7Pg1/028u3vQu1l56TspPoidHFHF+ji3Z3VxT1dpIs6yZfwIGwoDp+R9N+BcZW/DNqnn+btUGfO+bfVmc/mCrUY3sxBJo8eaOBmUFPmdAGc00A/CXmAGTT/bAR8MDOTMik2dLsR1ReK2/+t9fKXXaCXz3VWL1/sujXSvxeKJ1ii46POKaR5jlt4r8s1ErA61jmtdGWetrP5/TFL1YS2x0+vep7sSvUUPkXAJzunnsYR1a7XTwD1flYM25/GMHu60/9RRip9HunOHNI5hfZMd+bkdlKjc/JPRaMNplKVRgJSAuQ7Pik6zOM74/z791L5E/KeP158xoAM3xgfnPZ/EPB++3f17T5o17KX8MO55ic4+/DPotq/vGm7z6V8iCgYTfdhh2jQ8OQU6qS78VFL+F2E7js78TVUJ4PMD14a31mfI2X6lBvj3+hTPimEDT3PCuSMdH5XGT5YlmT/4UNI+ttZU+f9pG3cYf5ubsYPE1g9DuxatOSqd6azLzF3k6LiunUwaO9KkseiXMQBPi09OiM0A1buwokf9flu/ljzY8JQDLKdK3d8J872yTevlxgd/x9FSPr6hc/883BDy5NUUOpIP1NQyhtlqUkOe72R6QLQRNbf9MTmwk34Ilu+kqjVkgkd/muJfMn45AGwqIi9vhZnmgTfhJqc9mKqA7LjrdRDyfiePbljVzD6j3d/PNHRzXpZw7f6rqWVeZ+uaP/9aNznGsC+wzKKqaf5ED8CgW+mpP4PaEBTOWFlAAA=";
    
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

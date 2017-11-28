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
    public static final long jlc$SourceLastModified$fabric = 1511203885000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "Za1jOZzOaTFT98KfbR/59FL3wuH2938FiKTZ/q/wKhQboLijhWR1E0NfhmJDu7uzUGzKdeMV7z0nMaDw75Jb0kPVANqFGUDTtaySErYE+mlLh7h7tRIGyGeGKTvrcvTHsvmR0PsWFJJbTePncyNa/hmWfZj6WyaI1hsuZ23xZHO0fMarEsx/wELafI/irNlzG2nbaIa7n6bR1DoS+U4zjuHxp2ccLalx2MZwaTu20baHtqULTz0TSwc8hNt32YtnaNbCxf9yZm3WmZq1iv+Ytf+Ytc/UrC345zVrjZ1g1ppP16xpnW7WxM/GrFmAbrYB3eIEFIFbjV0g4RS6046SQtvOWPw64Nq2YK7tsBKw2fujhb6/zcGoXVmPb0Gxx571QSf+WN3umazw7VjR8Zks+PVtB/ke7UTtZSeknKT6LHRxZyfo4p7T1cWHOkkXDVIo4RHYmAbp6fDdGFGFITMecI63Q525+N9WZz6ZK9RiejPPMnkMACOE5M2eKIBtR/STkAeYOwvjlmL42exMyqbY0G0Lqi8U2/6t9fLFTtDLV05XL3/deWtk+BEonmMKKZyeQlonuIUPOl0jAZzfnZ5WenJOOxh+b+WomtD21NlVz3c6VT3xHEX4ndNTT/NwaufrJwz1QU4Me9THMGeiMy+UlUqfRqIzL//0FDow0ZnX4zQ1Oq/3mWi0yVSq0khASoBC12dUzwn4tjr/5r9U/iN51+8unzwgy3fVB/v+3wXe7+EdvbsO2lH3Mn4s2PrsaC/+KVjn10Yd9/mUDwl8iYf0Ysdn0PDkDTZIV/NznvB7CLrvIxHXoQYZZH3q0/y2/CzJ/HTOyDa2CzbqjE8FYcPAcwF5xe6vR8PH2DLsv7WISX8+b+qcHxwce4C/y5v1owt2j307Fiy65u1p7HvTXaSkuGYNTNqzkhSwuBZhgA9oj8o6mjlW/rwJH/R6pHCM9clkKAY5zpC7voHn+Jxd0EuPrv91Iybdd+nhDw80tjxHRaOeFFmiUd4kSyvleNAbnJ4BVpK1N/9oY9/r8KW1QiVdq2fSBvwHGoWS+TkHYFE/9qqaxnRnEgVuku9FVtfIrrdY92e0Xbvyx1zB6D/O+7FIVzf7xYzQinsWVxb844r236fGPa0BbMd9JFNI6yF+4AJfsGn7fwOERjhHZgAA";
    
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
    public static final long jlc$SourceLastModified$fabil = 1511203885000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}

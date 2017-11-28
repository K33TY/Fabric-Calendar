package login;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import javax.servlet.ServletException;
import sif.servlet.*;
import sif.html.*;

public class LogoffAction extends login.AbstractAction {
    static final fabric.worker.Worker worker$ =
      fabric.worker.Worker.getWorker();
    
    public login.LogoffAction login$LogoffAction$(
      final sif.servlet.Servlet servlet) {
        this.jif$init();
        {
            this.login$AbstractAction$();
            this.initFields("logoff", servlet);
        }
        return this;
    }
    
    public final void invoke(final fabric.lang.security.Label lbl,
                             final sif.servlet.Request req)
          throws javax.servlet.ServletException {
        try {
            if (fabric.lang.Object._Proxy.idEquals(req, null))
                throw new javax.servlet.ServletException(
                        "Error processing request");
            sif.servlet.Servlet servlet_ = this.getServlet();
            final sif.servlet.SessionState state_ = req.getSessionState(lbl);
            if (fabric.lang.security.LabelUtil._Impl.
                  relabelsTo(
                    lbl,
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                state_.fetch().$getStore().getPrincipal(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.topInteg()))) {
                if (!login.HTMLAuthServlet.jif$Instanceof(
                                             this.jif$login_LogoffAction_servP,
                                             servlet_) ||
                      !login.AuthSessState._Impl.jif$Instanceof(state_))
                    throw new javax.servlet.ServletException(
                            "Error processing request");
                final login.AuthSessState state =
                  login.AuthSessState._Impl.jif$cast$login_AuthSessState(
                                              state_);
                final login.HTMLAuthServlet servlet = (login.HTMLAuthServlet)
                                                        servlet_;
                if (fabric.lang.Object._Proxy.idEquals(state, null) ||
                      fabric.lang.Object._Proxy.idEquals(servlet, null))
                    throw new javax.servlet.ServletException(
                            "Error processing request");
                {
                    fabric.worker.transaction.TransactionManager $tm168 =
                      fabric.worker.transaction.TransactionManager.getInstance(
                                                                     );
                    boolean $backoffEnabled171 =
                      fabric.worker.Worker.getWorker().config.txRetryBackoff;
                    int $backoff169 = 1;
                    boolean $doBackoff170 = true;
                    $label164: for (boolean $commit165 = false; !$commit165; ) {
                        if ($backoffEnabled171) {
                            if ($doBackoff170) {
                                if ($backoff169 > 32) {
                                    while (true) {
                                        try {
                                            java.lang.Thread.sleep($backoff169);
                                            break;
                                        }
                                        catch (java.lang.
                                                 InterruptedException $e166) {
                                            
                                        }
                                    }
                                }
                                if ($backoff169 < 5000) $backoff169 *= 2;
                            }
                            $doBackoff170 = $backoff169 <= 32 || !$doBackoff170;
                        }
                        $commit165 = true;
                        fabric.worker.transaction.TransactionManager.
                          getInstance().startTransaction();
                        try {
                            final sif.servlet.HTMLRequest _req =
                              (sif.servlet.HTMLRequest) req;
                            sif.servlet.Action a =
                              servlet.findStartAction(
                                        req, servlet.defaultActionName(req));
                            final fabric.lang.security.Label
                              newLbl =
                              lbl.
                              join(
                                fabric.worker.Worker.
                                    getWorker().getLocalStore(),
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
                                                topPrincipal())),
                                true);
                            if (fabric.lang.security.PrincipalUtil._Impl.
                                  equivalentTo(
                                    req.session,
                                    state.get$sif$servlet$SessionState$_split_0(
                                            ).get$sessionPrincipal())) {
                                final fabric.lang.security.Principal
                                  currentUser = state.currentUser();
                                if (!fabric.lang.Object._Proxy.
                                      idEquals(currentUser, null) &&
                                      fabric.lang.security.PrincipalUtil._Impl.
                                      actsFor(
                                        req.session, currentUser) &&
                                      fabric.lang.security.PrincipalUtil._Impl.
                                      actsFor(
                                        fabric.worker.Worker.
                                            getWorker().getLocalStore().
                                            getPrincipal(),
                                        currentUser) &&
                                      fabric.lang.security.LabelUtil._Impl.
                                      relabelsTo(
                                        lbl,
                                        fabric.lang.security.LabelUtil._Impl.
                                            toLabel(
                                              fabric.worker.Worker.getWorker().
                                                  getLocalStore(),
                                              fabric.lang.security.LabelUtil._Impl.
                                                  readerPolicy(
                                                    fabric.worker.Worker.
                                                        getWorker().
                                                        getLocalStore(),
                                                    currentUser,
                                                    fabric.lang.security.PrincipalUtil._Impl.
                                                        topPrincipal()),
                                              fabric.lang.security.LabelUtil._Impl.
                                                  writerPolicy(
                                                    fabric.worker.Worker.
                                                        getWorker().
                                                        getLocalStore(),
                                                    currentUser,
                                                    fabric.lang.security.PrincipalUtil._Impl.
                                                        topPrincipal())))) {
                                    if (fabric.lang.security.LabelUtil._Impl.
                                          relabelsTo(
                                            fabric.lang.security.LabelUtil._Impl.
                                                toLabel(
                                                  fabric.worker.Worker.
                                                      getWorker().getLocalStore(
                                                                    ),
                                                  fabric.lang.security.LabelUtil._Impl.
                                                      readerPolicy(
                                                        fabric.worker.Worker.
                                                            getWorker().
                                                            getLocalStore(),
                                                        currentUser,
                                                        fabric.lang.security.PrincipalUtil._Impl.
                                                            topPrincipal()),
                                                  fabric.lang.security.LabelUtil._Impl.
                                                      topInteg()),
                                            fabric.lang.security.LabelUtil._Impl.
                                                toLabel(
                                                  fabric.worker.Worker.
                                                      getWorker().getLocalStore(
                                                                    ),
                                                  fabric.lang.security.LabelUtil._Impl.
                                                      readerPolicy(
                                                        fabric.worker.Worker.
                                                            getWorker().
                                                            getLocalStore(),
                                                        fabric.worker.Worker.
                                                            getWorker().
                                                            getPrincipal(),
                                                        fabric.lang.security.PrincipalUtil._Impl.
                                                            topPrincipal()),
                                                  fabric.lang.security.LabelUtil._Impl.
                                                      topInteg())))
                                        fabric.lang.security.DelegatingPrincipal._Impl.
                                          jif$cast$fabric_lang_security_DelegatingPrincipal(
                                            currentUser).removeDelegatesTo(
                                                           req.session);
                                }
                                req.invalidateSession();
                                java.lang.String title = "Goodbye";
                                sif.html.Paragraph para =
                                  new sif.html.Paragraph(
                                    newLbl, newLbl,
                                    "You have succesfully logged off.");
                                sif.html.NodeList content =
                                  new sif.html.NodeList(newLbl, newLbl, newLbl,
                                                        newLbl, para);
                                content =
                                  fabric.lang.Object._Proxy.idEquals(content,
                                                                     null)
                                    ? null
                                    : content.
                                    append(
                                      newLbl,
                                      newLbl,
                                      new sif.html.Hyperlink(
                                        this.jif$login_LogoffAction_servP,
                                        newLbl, newLbl, req.contextURL(),
                                        "Login again"));
                                content =
                                  new sif.html.NodeList(
                                    newLbl, newLbl, newLbl, newLbl,
                                    this.createBanner(newLbl, title),
                                    this.createBody(newLbl, newLbl, content));
                                servlet.createPage(_req, title, newLbl, newLbl,
                                                   content);
                            }
                            else {
                                throw new javax.servlet.ServletException(
                                        "req.session not equivalent to state.sessionPrincipal");
                            }
                        }
                        catch (final fabric.worker.RetryException $e166) {
                            $commit165 = false;
                            continue $label164;
                        }
                        catch (final fabric.worker.
                                 TransactionRestartingException $e166) {
                            $commit165 = false;
                            fabric.common.TransactionID $currentTid167 =
                              $tm168.getCurrentTid();
                            if ($e166.tid.isDescendantOf($currentTid167))
                                continue $label164;
                            if ($currentTid167.parent != null) throw $e166;
                            throw new InternalError(
                                    "Something is broken with " +
                                        "transaction management. Got a signal to restart a " +
                                        "different transaction than the one being managed.");
                        }
                        catch (final Throwable $e166) {
                            $commit165 = false;
                            if ($tm168.checkForStaleObjects())
                                continue $label164;
                            throw new fabric.worker.AbortException($e166);
                        }
                        finally {
                            if ($commit165) {
                                try {
                                    fabric.worker.transaction.TransactionManager.
                                      getInstance().commitTransaction();
                                }
                                catch (final fabric.worker.
                                         AbortException $e166) {
                                    $commit165 = false;
                                }
                                catch (final fabric.worker.
                                         TransactionRestartingException $e166) {
                                    $commit165 = false;
                                    fabric.common.TransactionID $currentTid167 =
                                      $tm168.getCurrentTid();
                                    if ($currentTid167 != null) {
                                        if ($e166.tid.equals($currentTid167) ||
                                              !$e166.tid.isDescendantOf(
                                                           $currentTid167)) {
                                            throw $e166;
                                        }
                                    }
                                }
                            }
                            else {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().abortTransaction();
                            }
                            if (!$commit165) {
                                {  }
                                continue $label164;
                            }
                        }
                    }
                }
            }
        }
        catch (java.lang.ClassCastException exc$5) {
            throw new fabric.common.exceptions.ApplicationError(exc$5);
        }
        catch (java.lang.NullPointerException exc$5) {
            throw new fabric.common.exceptions.ApplicationError(exc$5);
        }
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510545720000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "H4sIAAAAAAAAAO08CXgV1blz7w0JYQ1hDbJcQkDZckEExaAIASQQIM2CGJHLZO7cZGRyZzIzN1xAWrQCKhUrdeMp1AUrInXBunwqtqJWcKlaraI+qk+txQUXnku1Lu/8/zmz3rlJgKB9/Zrvyzlzz5zl3////GdmdhzkOugaVxTn6zRJKDaWq6JePBN/VPCaLsZKZV7Xq0lzVDjw+to+S3ufdXmQyyrnuvCCIOp6hSJLwnKDG1B+nhSP4PCIzNeJcqRUScTp3RLSW+ATSkISeDma0A2uW/l5fDMfSYhGpKayjNzvneAbRV3lBXG6qIqJmJgQJJF07E47Jg1JjlSJBunZUVdlyZjLq+6bpKEkpXEDCRQMidlSnGJAgFhOEfjqxmdi156tvhHksmu5jpJek9D5uFjO5fJJo0HRJIMgkueYtFzSYcnOgkKA1ngpYehN3E+57HIuTyItfMKQeEOMzdSURoMbUq6SheplxYiIKSOi8hrfyAhSgUQkM2VjqzlJR1VTmqWYqBnc4DTyVbB75fALUAub0zP80thz1ajIldcsztsZ4rrXct2lRJXBG5JA2GAQeGq5Lo1iY52o6VNjMTFWy/VIiGKsStQkXpZWkI5KopbL16X6BG8kNVGvFHVFboaO+XpSJSDCmmYj8BNJkhQMRTPRyY5Lohwzf3WIy3w94WAfmywUvZnQTmjRiZBT1OKE5eaQrKVSIga08IywcCyaQzqQoTmNIuGXtVQWCI/B5VPOyXyiPlJlaFKinnTtoCQNIHD/jJOCTBHBW8rXi1GD6+ftV0FvkV65SAgYYnC9vd1wJsKl/h4uOfhzcN7kDSsTsxJBLkBgjomCDPB3JYMGeQZVinFRIyog0oFdRpZfzffZdXGQ40jn3p7OtM/95396xuhBf9hD+xzn02d+3XmiYESFrXXdXhhQOmJSCMDoqCq6BMx3YY7CX8HulKRUYiD6WDPCzWLz5h8q/3j26u3iB0GuUxmXLShyspHIUQ9BaVQlWdTOFBOiBipSxuUSrS7F+2VcDrkulxIibZ0fj+uiUcZlydiUreBvQqI4mQJI1IVcS4m4Yl6rvNGA1ymV47gc8s8VkP+O5H8lqyWDq4jU6ETcIzNAvuuIwESmi/pSQ1Ejc2ck6qNEv4AekVJeJjDw2hhq9CK6JkRkpV5KRMqVegLKVAHwLCb2UT0Gc6YAj97LAgFC4sGCEhPreJ3wi8nOtAqZqMcsRSZ2ICrIG3aVcT13bUL5ybUMJswQJDwf4LUPzrFXJqfN+PSO6NNU9mAsIyBRG4Ss2AkZAaYL6FIxMdDFxEDvCKSKS7eU3Y4ik62jblnjcwkap8oKMe0pLhBATHrhYBQUwualxGAQQ9plRNW5s5dcXBgiEqouyyJMgq6FLoNdaluVMjSwAhHtF6eoSzZMOG5ykOtQSwyvPl2M80nZqCidpiQTxED1spoqRWK7Emgxfa12jirgGIPrm2ZvqZ0lwzR7EhhWREhb5FVqPzC7rzvwxZ1Xr1Js9Ta4ojSrkz4SrEahl3eaIogxYoft6UeG+Xuju1YVofPNJbgZBDOwbIO8a7isR4lpiQGXTgS9uKI18jLcMqnSyWjQlGV2C8pkT7zuQ7jUGfRrAvnvRP7fYvUDcLefCmUBlWFguwcLtPSnVamb9/3pvfFBLugEJeSwPfC7F1qZHrbgVGuiSDz+/msrfnXVwXXnoNSQHkP91iiCspTYHOJdCWXX7Gl69Y2/bn0paEuaQVxvso4EIykLL2hHXOD/flbf7cCLrDbchofYLlmk2lFUk2hUYlJc4utkEUT7m+7Dxt374YY8ynqZtFBCatzo1iew2wumcaufXvzlIJwmIIDvtGMRuxs1yD3tmadqGr8c4Ehd8OeBm57kNxM9JeZUl1aIaCEDlrb1tbUNBVyMUe9xy7Ydd5R0ue0WZFIuKgQJLxCLIsIoGGH+7o7szrfI2A/IOJqR71VWP+EUD7Juf3tdnJyAXI8ARIVtXZ94+mC/mXtQroMCMdwD05UmZilCidN8EdlNqsQno1IzYIPNEkSjnikW8C596+uFhwGTdW44dihceA4C0zkm6oImqaaIwnK61EjCTxLomMtlG8pswggrgtP4hC4Tj0ftSTXenJFSNYgfmnkNOU4VIAXiboFRAYFhVDh5/TpNGXrpRBBdtxoO96Pzi046G1wNYN2oaGqDJIQRsbASD1OND/NafbJRTBhh4sGaZdGAW44oLnxCHVBRjIX5OqVZDNctD680GiR91QiYfRph4jCE1kSwuJRPJBTDg2ZUyBakew9G4t/SQGSwe0xa78ljS9dGT7r72SBT775ezzGL1xuIGdgnv1J71f6Rg+isDjPB7j84fc1VVz9w/0nUuXQhpMmbcgaHf0jHEQaXw/Amqwzy2e1UE1yZFAxLLex+5thz32WxlFdWHD2v/qJX5YVn/aMG9SYooIKcQBQmnpTleZaThXKKSvgzx+KJ0SCGdVUUSPQdNsUiXAj0LgxLiXC6Sz5HJU5XkFTSH/CoOBeoNcbEwyKwB5dqhTRIMqX1jMu6Ts5vWNJsytZMlJvemSKAAS7PXA4O3vZG1b948pWJmw5sRFPVQXY6S28w6xkpb5WfLP9s+Z8ocb1Bi0NPo8KJ2xs/DxZmPxHkcojjR1klW64FvJwEz1BLdhB6KWss57q67rt3AzT0LXFE3ad73KLTpmQBKLap6+k2dScx1fsfP1MX4PDiLBwyCssxUIw1vVCHuJQggRKd8nvyFyD/38E/zA0NUBPoS1kEHbZCaINbXPHW2o2ntkMIKiVKZUUn4QWEoKeOGzt6/IQx409G0OcgaJOgKEH054HT9dGXqmSdbjh2Nzd//OuCh6+ZsgglwpUcgFkCaXtz7/iFJyx49KICfT2VixGWXJC9azHumtlQ77hX94VO7GwUXY4qmAXhM+6qCH916Glw4cz7cpyLoplncTkPODCQ/BMrEmhg9TkGt7BthI876C3VRXTiFMiuegz8xmtqhCJVtGb7imM2N+JGN8r9DSLKhAOsVzHrhfcGucJ4cNiZOB4VJs1u7Dl3wqj7KaN6pTM1KvSYdF1d/MIznkRZ6I58QHNURTky3BF824OKqtz93DkPXzGICgfuvGzPkPcX9MSdCeU44JPljSbBTczl1Q45rz36WJ8lL4S44Eyuk6zwsZk8xuJcLgmCRb2BbJdSKvMcgWWwkwyy0KnA46ttMzVx7/bQcwsWbabBkyMy7+fG05lxYKmOQY4erllppgO5V2NJ5iCAaiyTyJWsluBuHHW3PsVR+9Psb39CVhRswC4OskNHZZFUIrkdmThV6OmWv0KTGkmA38zSGOLFV176ffGGK2mUTAkwNC3d4hzjoEI+FKtANIe0tAqOmPn3O1c9tG3VOiqh+e7MxYxEsvG3L3/7TPG1b+712Q3nWn4WmhrcfjCdRYVv56wrOzCbBM4h3JuWKujNE1SOsaks4W7qLOkV5hqI2kVQrKVSVmQvZgFCl7XGRIUBUmNy62dPVSD4XVUnUAZXkEmkSqxwzDu9PfOG267P+Xj0VzegKFuh7VBPaGsNaDG8hXKqJbthkKJhzGf+mdXPerYJnmgRwXdGi/vKv91y2suP3EujRRg2yxPrYaNurdofGkewnNB6Vp/vXJVpzMYMGgOX4yxtgV/nIGKLiOJgHIYjVmMT3liDMRUUF6dSboZmNnXjSoR5u5VJI5Ch2RAFFo3F3Z+PmSS7P5hdxXIamndc+BSEZDyWJwPaiACN9DZjCBwIpN3UfcLbCl7SWHjb51BhRJ05/U0Uh06CldBHj042SJDBrTdPAAampVTK7NtUiadAMZIEwnkxmrAJq2yfAjdubCGitYByRbTVS2v2fHhm6j2q6EO90mMNsSVoc+9rHs6/feNUOwYGu+UlQaXIx0SNQh4VDm15Tayc8NVHNIOhLEt4E/aWKtmaAbl+DWeBVW4l0PVLozObfuJlN9x58K8VZyDzHRtMt/9ghwIOYvakxIRyuzuRZqt2taI6tHtxn+dHDXj47EtM5NfTGTDP4SKdc5iTen17739pT/Osj/zp7Tdiyom9HjnQr2AlaixV2dvZqlD91pf8Z2mSYZM/XFy++/c5lU85yI80JRRehh0phaHcZpPkHmvD6iHJNMUwFKc1PW3oa+eVfPvC79KpMsKNoGeka9M78qGCDa+vnm/OcQdF9XcOVO+jTb+mpoI4TqfoP4j3bs5s0n5jW5hH7KkXuab2adppD3vMJv4ii/jpTbQeYtoHtIpQFFs2Ff+ymS1tYHWdw6a6ZyBxf6YjEfSgWy+8ckts/i3jTNJdRHwwCXzHyGKzKDumCureHcRcPASy47CTb5xeNGB304b2yxPDzyL/lPBgD1JeYG6bu2PvmcMFskEOWdngtIMt9yBvaouuWu3ajB5vsaEHkHcA3a8ESll9itO1oSfy92tB9GvUnbkTonlsppNZPcrLWNvDBBlf4Pcka5YimCXCRi9g9RyXo4dqsjVghN+ACucAg6tqU2JLrsNmejgYlhLNylLRL601knRcNYJK/wxaPQ/FSynLef8lA67pGYuaxNIEMUo0xK3qvCP5811j9pnCnG/r3ztYvuWZl6Vm7Q7vQvEiiTgo+M7wAq9/bnBZzYoU4zg/Z55mShl0zJ/3iny4ef4/3rrLBG8KxVp1keJDTyNZkNDreL/Zpy8n8ioJbPZbn3vs/pv7Vo+hUTUc0vk9FjCVZgbIXRYTWIIwCrAoZgJQw+pKtyBMjNElmRBookp2bYT3hL+Es5BVw+1MmOYfwgAEiAUM/yzdzznhd5rz9++64sD4x5/eZEUJ/obZFU+zvLaFHaa9xpX1P3ly7X27cXuQmyAmTZuXlInRCcqSz8mNK1XmMgcpH+rba1UqijHhCvmOeya8t4j65vSEu9VZyZpUcuZDs4YHXee/sEovGlp+TkWryq3S4xlDav1UmuW9vs+Q96KGBqXY4EKEH3aS6XUq1odw4SNnMBXWL2n1NcUCIXKs51EjmrWkxgiK/cfIzpC5A11hgTd8pQja3oQ+sNcIdGBAo8rhNbR28thYOI3jyhgjVFYvasHGlvoNOO9IbKwmNh2BjUUkCVZkNPVghyzQZgBosxhICqvl9tL6QD8qGJkjKxCWQAHnpLtH/JHacxlkhh+1qfgHBrdJ/AkNLPEP5NviHzgKTNPE38bIEv8lFkL4xEQv8t+d/P+T1R+1dxayUmxKivqxyXA65ga6Bkb6ZjhZL78MJzRRsjT5ZPug3U4i9Ibbx1MyBboxcn0Dy45Gto9hSYTAST9G2s20bIESK/8QKIari/HWJRYap8GE05j4SqyOpRmNyzNaqY0p2mMTLHGialnOQK9jZD1g7ulQ9GnZcg6FYhhqIAoD3nnVP9LyWNI807WRcDqwndXrXETxSZHMViQzpOrR8Y03D2qFE80USaOqJES2kyCRf6cEUkBawQ6MPSFP2G/5a5zLo2CVt5AZsWBxZUbOHyeWXBDLH++7U3cMsWOe11945Tc3Xdo53mrMM6z1RxqqRGP1wI0vXH7d6hpzupN8pgt6XEEhNA5jVLie1ZvazRXUtMkVLEh3BbBnD8ylrFjUlp066Qxl1NqWkwbvTt3TtNOiAh70n8iwv43Vm51UgNExK5r15DdYTOtIcNR8O/u4rw7O2W3H5TDN/9Jkh3vZcWy5bX7LkhWL04TQu5xLCkduX/3Tt7f9cgGVwpG+wbdvPuUXdRX3zP3v75KOfIrGFfqcSdlh7Ux4+PS6SbPXXH5ffLrz4QPfIBh7Bz7dfcplsfiAIJflic7jftE5jnFE57n4vOs8x8Gxm7bfAp8auAyQu2aLCsH+ZdWn3Jg6C5nUmUqvlXCA01P3cbxntLDitHc3ftdUhPuMbg28XpYgUT3aHQ3ztNYvg+vhPSAoae0E37NYbWTH9f1LT/+APodonXfB6BM8J1aYpIC9fV/QdlbXOF0nCZ2gdwB/Js1IKsMBFqQtMMcRONUnbQFzV7N6lmMNfPRD18FKuY0/QhdmI2J+0GHXcnh0Y35bH93wCUA8z26A2z6Xan0FrlPsH7fArdPxPqf6PUO1gDfz9KmK3Yukvxx4mTihWq5fY1I3KpMJQ2oUK03ziE+qOfeT6IcozQ2u0IUcinXYDLEY6aDrhSyaBwsZWEGtndt4FzEiNrA67iQmSze6RwxlPev9RnjTlIG1ZhP8WGaDgbH0+WgYV1lkG0ll6UIo1niE4Gu33RvB7N0NPnYPsR3s3LwgKKKVMaUeuokGoIPAO6a8h+wzUoKIz5H5xKI4HuSVPs31dygOcPZZjSP1ZEtAKU88r1ZqZS6jQuGQJTP2zD99Dz1GsCSOpjQ9D7JAEMsNIf/5BNdnWf2gy9Y3ZQqeAnF3YBxmw59h9aPeaQJSRmeJ+7zAFqSwkZFDuEw/Nv3jPsu4OITkvN5NLZrpFafqhC3Ahajw9LgLXn3pkviNmJ4NyQ24WBG51KxL6/hzpN+TfY7ZHKegfnQGCe9JID7E6v1pdD7kHtCDdXzTb8BRRUDb2xQB3e4TAbmZ4UXpHSeEqHR3txomWTPimUIhm+lTVv/NOSNMeK9H9vqYIgy9P/EbRWVPteXsgVbkDKcsYFMd8JkygyW4z2Wn4MglsBNhftQO9namx392U1polFnCosLe3/P7vnjshm14ouaVn0EmVWBvZyZVZrSb/Oxpk/zsTZMfTBaaEfRz2DIvs1GozLxVgNsLjg6Hl9pjF/BaC+LdZEX+O6mfgHI/FV8oGtIls4FKJhSX2TBc7pI3uL4iZRGQe94dxoBeBigEGU6CoPAea4RogsLyoWZ6dDK9NjipTdv6ZYq2VNSK7DDHu8ePamKjYvhu9d+6dOtba3/pcxwTeKdVuOHnO3aB1Dno77rsDh9D8bbBdXWB1oRe1+dQBRo+pOCkn5M4G0lk7aWDLTiEmCg4X7Zl+0hPjAJfW7bicA56A99blqnFg16sqmgTjbqDWf5Rtzt/medF0ik8iCJcXusUI2h9DxbIhav3M2rNB9Anx5wjmGVP5DwqsJL1tUecrG9BHNPy1oEPnEbgaM8pAK+8tlgg6xQGQOBMDmU4znVyCPqH0oh2jM5XgqCdAWRrpx+MObDuQCi6tShJeKASLEAo7QMVCnEne9eQb0sVJjLbBrhfIvOwpco+DYGWo/PNweFt8msFnJMetoSFTQkb3TYJG5pGwGN0hEH5hangkT8Yo2Ddk6AoalnCIPEcHItkQwDxzrv+Dsgm2OyUNyYKnvqjxkTBKW2Pidyy44iJgjPa4tpoZjQ4yw6DW8+MNplRVHDukUZRwdEt79+Dp0LTr/AS80tvQ/FJE+e/FYeb10LxXy1ulKHY0tY9MF57smBQpGc5bOmhB/bBKJUeNaOkhCyBHmjrEA2vHoJWgRqmzKxrYzyWKY6E0e8hSu+bxi8tjGj6V3D7sH43E0Tr5PSYOU+6RtOP7JVg/SILafN4+pjZcxtp22gGGw7TaKqtiXz7Gcc1h2ccLalx2sb1LdhG2x46LN2Go7F0wEO4rKJ7DmrWfvb/zqxtOVqzdtN/zNp/zNqPatZu/dc1a4+3g1l76nDN2rPtbtYe+XHMmgXoTTagW52AInAv4xCMe29z7JJuP2rxa4Vrt/tzbaeZrGotSL+PntVRmjyQMZMOxUP2qruc+NuBdqb0ePBjbGg9PQ6//ugg39721N69XlL9GLr43dHrYijrMHUxlNNOumhwuQKeRkZVeEEu+DndUW2B/unnsK3qzDX/tjpzZKFQE4tmQmEqjz5gBJC8mRMFEHpgnIQ8oLmzm1AGwpmZlEmx4fIgqi8Un/0762VobDvo5cTD1ctJ7ecjQ/Dceeh4qpDRw1NI6zA9uLDdNRKgmnZ4WunJOe2k+M1qo2pC3znHVj1/0q7qKSDIPzk89TTPCdtfPwGYhW1i2N40hjkTnaHFGan0QyQ6Q8LhKbRvojMkHa5Gy0ej0RZTq3CuxYQAXZxf6oHHB47z+XIg+6KlUPq4uPVvc0b3zvDVwH5pXxVl4+7Y0r1j3y01r+CnsKzv5nRjHzdyfi7HcZ1NWBGXUCm60Wdh0PaEkvC6DXx3Bn4046k0fVnCfikBn8SG58fg7YQ1rG4yuMqj/d7N1Dp4RkowXB9yPAazIqLLEJ/+BteLflPJ3c3Gu63vHsDT0PjJIaDGVaxeCystR1lcwd49CP0Mh2T4gAEUV0Ph+XgB/ICd";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "UWglXHlfGIB3BbgzOfqC722s3gp3j+CFgdAqNUVPNF3vFvt+ryC03v2pOnjXN0m/oRsVPjlx3PRH9gx/kj3ZnvEDMfaIO7fMnrfy04n043YdBJlfsQIW7VrO5dBMA8IAX+sbknE2c67sWSP+2e2u3GHW99mg6Ot41daF3RD77GxjKsNzwK7v/EaF68947psn65ueCsKbdnmWupY2iMJSMeb3ULNngqXcqvWPr8u/AJ8FzZX0ai2pG/DJ3lzBfO8a4DHoE6AqNWlXEuBGpT3b7ZrZ9WD37qS6dWv2sIWUCcd7PwTgGmY/uhQ4b9P88pzvF7b8igGSqzd9oXCw6tITDvUELUXq/wD67n6MuVoAAA==";
    
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
    
    public LogoffAction(final fabric.lang.security.Principal jif$servP) {
        super(jif$servP);
        this.jif$login_LogoffAction_servP = jif$servP;
    }
    
    private void jif$init() {  }
    
    public static boolean jif$Instanceof(
      final fabric.lang.security.Principal jif$servP,
      final java.lang.Object o) {
        if (o instanceof login.LogoffAction) {
            login.LogoffAction c = (login.LogoffAction) o;
            return fabric.lang.security.PrincipalUtil._Impl.
              equivalentTo(c.jif$login_LogoffAction_servP, jif$servP);
        }
        return false;
    }
    
    public static login.LogoffAction jif$cast$login_LogoffAction(
      final fabric.lang.security.Principal jif$servP,
      final java.lang.Object o) {
        if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
        if (jif$Instanceof(jif$servP, o)) return (login.LogoffAction) o;
        throw new java.lang.ClassCastException();
    }
    
    private final fabric.lang.security.Principal jif$login_LogoffAction_servP;
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510545720000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}

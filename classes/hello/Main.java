package hello;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import sif.servlet.HTMLServlet;
import sif.servlet.Request;
import sif.servlet.SessionState;
import sif.servlet.SessionPrincipal;
import javax.servlet.ServletException;

public final class Main extends sif.servlet.HTMLServlet {
    static final fabric.worker.Worker worker$ =
      fabric.worker.Worker.getWorker();
    fabric.worker.Store localStore;
    
    public hello.Main hello$Main$() throws javax.servlet.ServletException {
        this.jif$init();
        {
            fabric.worker.Worker cl = fabric.worker.Worker.getWorker();
            fabric.worker.Store lStore = null;
            if (!fabric.lang.Object._Proxy.idEquals(cl, null)) {
                lStore = cl.getLocalStore();
            }
            this.localStore = lStore;
        }
        return this;
    }
    
    public void initialize() throws javax.servlet.ServletException {
        this.addStartAction((hello.StartAction)
                              new hello.StartAction().hello$StartAction$(this));
    }
    
    public java.lang.String getPrivateHostID()
          throws javax.servlet.ServletException {
        return "";
    }
    
    protected java.lang.String defaultActionName(
      final sif.servlet.Request req) {
        return "greet";
    }
    
    protected sif.servlet.SessionState createSessionState(
      final fabric.lang.security.Label lbl, final java.lang.String id,
      final sif.servlet.SessionPrincipal session) {
        {
            fabric.worker.transaction.TransactionManager $tm37 =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean $backoffEnabled40 =
              fabric.worker.Worker.getWorker().config.txRetryBackoff;
            int $backoff38 = 1;
            boolean $doBackoff39 = true;
            $label33: for (boolean $commit34 = false; !$commit34; ) {
                if ($backoffEnabled40) {
                    if ($doBackoff39) {
                        if ($backoff38 > 32) {
                            while (true) {
                                try {
                                    java.lang.Thread.sleep($backoff38);
                                    break;
                                }
                                catch (java.lang.InterruptedException $e35) {  }
                            }
                        }
                        if ($backoff38 < 5000) $backoff38 *= 2;
                    }
                    $doBackoff39 = $backoff38 <= 32 || !$doBackoff39;
                }
                $commit34 = true;
                fabric.worker.transaction.TransactionManager.getInstance().
                  startTransaction();
                try {
                    if (!fabric.lang.Object._Proxy.
                          idEquals(this.localStore, null) &&
                          fabric.lang.security.PrincipalUtil._Impl.
                          equivalentTo(
                            this.localStore.
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
                                        this.localStore).$getProxy()).
                                       sif$servlet$SessionState$(id, session));
                    }
                }
                catch (final fabric.worker.RetryException $e35) {
                    $commit34 = false;
                    continue $label33;
                }
                catch (final fabric.worker.
                         TransactionRestartingException $e35) {
                    $commit34 = false;
                    fabric.common.TransactionID $currentTid36 =
                      $tm37.getCurrentTid();
                    if ($e35.tid.isDescendantOf($currentTid36))
                        continue $label33;
                    if ($currentTid36.parent != null) throw $e35;
                    throw new InternalError(
                            "Something is broken with " +
                                "transaction management. Got a signal to restart a " +
                                "different transaction than the one being managed.");
                }
                catch (final Throwable $e35) {
                    $commit34 = false;
                    if ($tm37.checkForStaleObjects()) continue $label33;
                    throw new fabric.worker.AbortException($e35);
                }
                finally {
                    if ($commit34) {
                        try {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().commitTransaction();
                        }
                        catch (final fabric.worker.AbortException $e35) {
                            $commit34 = false;
                        }
                        catch (final fabric.worker.
                                 TransactionRestartingException $e35) {
                            $commit34 = false;
                            fabric.common.TransactionID $currentTid36 =
                              $tm37.getCurrentTid();
                            if ($currentTid36 != null) {
                                if ($e35.tid.equals($currentTid36) ||
                                      !$e35.tid.isDescendantOf($currentTid36)) {
                                    throw $e35;
                                }
                            }
                        }
                    }
                    else {
                        fabric.worker.transaction.TransactionManager.
                          getInstance().abortTransaction();
                    }
                    if (!$commit34) {
                        {  }
                        continue $label33;
                    }
                }
            }
        }
        return null;
    }
    
    protected sif.servlet.SessionPrincipal createSessionPrincipal(
      final java.lang.String id) {
        sif.servlet.SessionPrincipal toReturn = null;
        {
            sif.servlet.SessionPrincipal toReturn$var41 = toReturn;
            fabric.worker.transaction.TransactionManager $tm46 =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean $backoffEnabled49 =
              fabric.worker.Worker.getWorker().config.txRetryBackoff;
            int $backoff47 = 1;
            boolean $doBackoff48 = true;
            $label42: for (boolean $commit43 = false; !$commit43; ) {
                if ($backoffEnabled49) {
                    if ($doBackoff48) {
                        if ($backoff47 > 32) {
                            while (true) {
                                try {
                                    java.lang.Thread.sleep($backoff47);
                                    break;
                                }
                                catch (java.lang.InterruptedException $e44) {  }
                            }
                        }
                        if ($backoff47 < 5000) $backoff47 *= 2;
                    }
                    $doBackoff48 = $backoff47 <= 32 || !$doBackoff48;
                }
                $commit43 = true;
                fabric.worker.transaction.TransactionManager.getInstance().
                  startTransaction();
                try {
                    if (!fabric.lang.Object._Proxy.idEquals(this.localStore,
                                                            null) &&
                          fabric.lang.security.PrincipalUtil._Impl.
                          equivalentTo(
                            this.localStore.getPrincipal(),
                            fabric.worker.Worker.getWorker().getPrincipal())) {
                        toReturn =
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
                                             _Impl(this.localStore).
                                           $getProxy()).
                                            sif$servlet$SessionPrincipal$(
                                              id))));
                    }
                }
                catch (final fabric.worker.RetryException $e44) {
                    $commit43 = false;
                    continue $label42;
                }
                catch (final fabric.worker.
                         TransactionRestartingException $e44) {
                    $commit43 = false;
                    fabric.common.TransactionID $currentTid45 =
                      $tm46.getCurrentTid();
                    if ($e44.tid.isDescendantOf($currentTid45))
                        continue $label42;
                    if ($currentTid45.parent != null) throw $e44;
                    throw new InternalError(
                            "Something is broken with " +
                                "transaction management. Got a signal to restart a " +
                                "different transaction than the one being managed.");
                }
                catch (final Throwable $e44) {
                    $commit43 = false;
                    if ($tm46.checkForStaleObjects()) continue $label42;
                    throw new fabric.worker.AbortException($e44);
                }
                finally {
                    if ($commit43) {
                        try {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().commitTransaction();
                        }
                        catch (final fabric.worker.AbortException $e44) {
                            $commit43 = false;
                        }
                        catch (final fabric.worker.
                                 TransactionRestartingException $e44) {
                            $commit43 = false;
                            fabric.common.TransactionID $currentTid45 =
                              $tm46.getCurrentTid();
                            if ($currentTid45 != null) {
                                if ($e44.tid.equals($currentTid45) ||
                                      !$e44.tid.isDescendantOf($currentTid45)) {
                                    throw $e44;
                                }
                            }
                        }
                    }
                    else {
                        fabric.worker.transaction.TransactionManager.
                          getInstance().abortTransaction();
                    }
                    if (!$commit43) {
                        { toReturn = toReturn$var41; }
                        continue $label42;
                    }
                }
            }
        }
        return toReturn;
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "vwDDo2cLGLzv7Xc1bAAZ7mTrXGqbx+V6e4ZCg7pfcSz/u1BP7kHvslv9JPtrtdCC9zCNr8JDkGwzyJAU8mjtEFRsDwIV2zMEFbuYM34sI1DBGPIdG0Hs8oOKXecJVPz7v0BFJqDiuVYAFXC13qnkKHN02j51h+QoqnxK6PDVVhM6PGaOwb3/1zvt/V9E/YfkgF3rtZRWCOn+FCuiRUz6F5O4/fo3h8BorEWY/uFSA3/RWquvrFdt/d/uN4ntrpC3I+I5J/d0mpPHO8/J+z91nHyrU5wMhiReVt7ZaVb+T4ashOT9DmylQyoz4zFc/iMjL80Y+eEZ8T873An+UxSSDd+4g4fhwwM+Gs//IwOx5Dlp3x+vmDYoxQfjh/r+Mwne7pG9fboP2Vv7Cn6axfpPCnrzL/85v5vouM5RNalRRp7hAksG4HqR3cMg3fCzfPBHT5wAbrmFZlhgsi8wcgxDlaElPJ9jkDXn9MnXkpplFfyTo/zJWpf2j5NnHyEpoCjDeeTVURPv+48vh+ZiujDgrXsoL7FYB1+swgAIWHYVz8th6N7A6uw+/KxB9mBs8gm9/p49koXLcAnfXgmxSPp8fP4ryfh5FQw9UE0yPDfGaeyBW+zZk91fRocvG7ax/8KlXnxn5gWLf3B0whH+HeCU32OwWxzau3T5te/OZt9S7yYqwjXXwKC9KkguixyQBvhw/JiUvZl95SyZ/M/ej+aNtz65DckQx8lB1+wc34YM+gCt63+YqRfvXfDS6SNNrT+hHqOO9LU8RkmzJG6QYsmAN/88HWwgm297bmv/G+hE60ierNdobboB/1lMnmh+6QHEsZi966giCM6eSYmb6jtR5OrZdZzocJu6b1/O+CsZ/yd6v8PsamafJQqt372iIvfjK+03GfFUBv/k52jVZXEELQ4dU/L/ALmFWlIfaQAA";
    
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
                            fabric.principals.HelloServEP._Impl.getInstance(),
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
    
    public Main() { super(fabric.principals.HelloServEP._Impl.getInstance()); }
    
    public void jif$invokeDefConstructor()
          throws javax.servlet.ServletException {
        this.hello$Main$();
    }
    
    private void jif$init() {  }
    
    public static boolean jif$Instanceof(final java.lang.Object o) {
        return o instanceof hello.Main;
    }
    
    public static hello.Main jif$cast$hello_Main(final java.lang.Object o) {
        if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
        if (jif$Instanceof(o)) return (hello.Main) o;
        throw new java.lang.ClassCastException();
    }
    
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "r6sO7xSkDA1CUChE2szn7ZZVW3Hne1pMZAfeMRZAQJ5Sb8nIHkRpXDkVmaO3PHWnsIkIljCc3nKCk4AiQ7pbHCU8cctFZ8alWgNrXLBkDBNbJD/wuszP7MiAVttMshJQJsy0Izc5MFKxH5+oZIqknQM66XQV7WEKYXieFIqaQab1Ye/2i2aqCweLZAVkyju7HRz2OifCgUQa/hmLJU7nTbQ5Bhxubg6zZAXsDyw0+PuNxbcZEss2tTZYNol2mLXTqWCQRX8nLtodldorXvAt2lhl2ua0XDB4KJ5BDhs3ukZ2nkYHfGXUFbDvMMkY1JPF1yy203ixglOLcBu3EnBzTmy545GGoTUWWmy5KhB3bW7HgKgcIu6siKd1G7HEyh3GDTO+3JaN5DVrHBTOeSFUxgjkJlUIL1xzRB0cg6QdWfgMrcXAGmiNR6QIrdCFUMUhh1d8FMsMxIYe6y1zxMV7WiVsQs6WzBqn1L0EStMtBIqDc4TTARwC3pAaL7Sbykymc7TgN/DR6swDp0Cyka5SLp7BQ81nxL7hCo2DGgZSrMg/7PeiyJ2ysFk5mwHe4sTCPszGLXpplSKi0c0JLgaoPCwbuxFmiTYalUFRwHS2ZbaHo6uYXRAzDC/DoBsT61nvzo/90JwSRgRwf4mMkkkyoRZpeYTlNXiCIMtfjaYD9vACdxlycA4tjQr7Zb+nFbZtNKmnJVyWpngxo/tG66VebmSJDQ/9iL0TdUPL4LRLkIaSr0wBYJbAASRAEshwyzt2VbwH7WW0kdK+AchuNR/j4lDkLagNGR2n9wCFI2t4KfWoM1VWDZsPMFuiZFQRgg+kK6F1uo057rYBDTPtNeTIPKrpNKPADZ8scIcFbKGRLPcojysadlRH2oaTnRuIckUxlFDoYMqAULTKOLuFpZRpxSbdt5KVErAO6PsTHfplm3gHSNoixxnK4QcXMkUzFbqFa6OLsB+S4+rMyYeD4bQctBo2jr5v5zNpr8+n8mggNSA6Y5ut269oO1NOAYxyp0Mhg2Ih7sxzwZcLF0j1ZYUzDS4zqXwu7IRyenorA/GqDchKmPEnqFn5Z5xgN3SxPyDZQVnv52IeS3jGZKc5Kvm4dXIdg3OphSPsMpfzfRUVcNxXWRqfq+a8DOnDuKOdZStnEN0urJ2ZsVO9pYYCZDpueMcYU5SpiOe3eyGx2UgAyRlNtpo/nZamCy0XQJgxHsZZ9oI1myhh+Jm5oNd4UiWmo1rzYaGLWweE4Bkmh3NCNCQWWWMwfK5JVfeCPUNtl4MQgknUREgvWpulpcx2yXGvyKKguOSSoUzQm0bRwFQYxCreIouZOTF4dhmO+6S1Rp+avUzZ8Ek4lH6Wj4R2QKCaqDhwM1vIJj5IwXC23ETWvc24+S4thbL7WS+JMVwahD+GJquTnh3JxjB0L9etfibxIELMdNvOzlLqyiNXYPZqpEofBShtkPbxbNvW+Mg0SVzJjGbkOn/SqOA0nS9aKAIaZLW2i1gChL0H01QjLByxTUqbbrWSn2tnksRRV9ErWp+H+7W01LNCkk8RM+590GLhO+NalQr+HOHqY1IhTZqmo1nZUw0h80VP7mC6PkoWiTiiBBt9WEpQEO5k7LwbYCINkMEJyDwnVM7NJQIDazkUKCkVUbimnQ4+pPDW72ENcCVCjPV+Z0eFPySS7xzlkROUqYvFjQTlQ0MtIs+kNyWgz4nYiOIdVk7rEbvFAhY3AA1IvD5PGt5KKzFh+mkzhkknyBrJEyslIo6plWa1KJtZXletjnmKqfYxojLU3dgsHSV0NYbzgF/nzEKrbKbnmZNWM4QtcykBADyRmTQPZba9AFm1ihZH9GgyRhsAAYoQR52slnhfo6Exhh2tsV0cw3NcGASKGVDWSxnBsceEPmVBCNdL8bDP5w3nj6xZq2twyQ1iOWc3GGQS5pFosSGhj4fdqd4g+tJdWz5mCnSGANm0IR3X2cR1cvYxkDmgOwE1qgo/9rRHF3xd6E28O8FnciHYAcC4XXf00OwgYi3e7ymGjjbBXNy1Q5OBdoMtUOkQgDuoJRxMPaEiQEvnRegeO789pRgTqjEEL2lqZ5AAa+r1PDgZLjiGbMICaW2CVBVkaLxuQHbIksXAAUoRmKS8xbg/Zrgqim00LbVFWJmWd9AA+9QcYxtJl8ZByVkjPc0NepizFLzpTpYzQKcZOlz24xLMo7AxTFcSV5tgkkrT836XN4udcpAs09IGy9+OqDoNo6P1uO7npyYdHNlfJV6cgut0NPxGReFe90Cg7TMJw7FyZ2PL1RhncJs2aKxuk86hkh8XsM3GXCqnM0PaTJKam9hcw03AGn7lepUAB+a4CewsabU4I/gSFWjOZ6CEYYhFItPORtNUdcnKqq9QurXfLvG55DG5jALhGrXSvaFhABKDNrJebbSSpWzQMMh8DM9QopohBC6IB3W54WTDQwh+BTQuqMGrLQz3RdbKCwqHdwnkLkOUkrSYOxW0a2KZh8JJEA06mM3P2hrvwZ7EvFXXLPSADAIuhJFVRwXnqJh56zgwdpBLr60T2x14lNVM+wjKbMMaZ3Z2tvXFuAEvqqgdgiIRKA5uplF5Om5BFY1pnl9siU0CHfhQ57vpqnM7c7lOyeX2qJ7llXGMS3LKRBkjViORiXiOGwIjGOc43Ztbse4kWAI5sk/TmWH5DowYvi3KTZ7KBcMTASZND8xyu1720vEwgLrUC5LtnXztuEQyKOcxq0cK2DO2zCnEhWRRH4IcsATu5K1xQA4JIufcEJxtFrm+yTJ2jVBSv9TWc4lJBC0f19GCXMUrf7MB8QFfN/1c6p0GuKQCZLfJE++75nw8yF2+yZm41H3mabkDb/nRpiXJDHK4DTc0C8OZ2ThuLpJdYWzOdjfVUHduEv4i9xx1AOrZSlpEdFPGDbaVqqI6EgQ2EEKx3JLRph36cT+9TE7VmlJKsmU0aODXlF0feHheMjNytZGY4waky2UmsobrbDVpWDTgitqeybDWDjhlEDP4nEYsLYDQCZkFUzk7px2LSqSmBTwqbSyxtWFgNjTVGGWsgYMX+RRcVKaiE2I6pYg6VPYDSiHiHPAyOFiusmKtH4CaUnEYUPRz3RTUsQKOQC3M06rICZiZMsgWOIJJLtHiEthOB2yW0n2xR1o+CBVXqxajZ9rT3dwqA3GHkUkfy302zAfKAUL+xC3Bw3SMY5e75QLG0+m+U1XyOJ37cy9oW346EjowxjIdQsY53E2bhDxkneydAqCY8m3qLvIN5tmZBI2bWSJFrc4bl5G0GDhgiTRIk9U8oghWrCj5IsCjcjOnzwrs8D7sjUuytKJ3SIvbRUKZceCX4bJ1/I6MrXUsbbFTRBopxqdGlOcx5fW7DBi2eu6N0Aqjius8I06k6+60vSI10/myCaZmWJ9IvzDKjFtQh9VsWrY+zuj0QRuWVYAKCxyt2ynAdissWZVLP8GAfI5FmcE5eOoZftKpUr70pHnRewFCyS22X4O9RHobawy79OlgRtjMUzKn2SysDliysZF2KeLrnAevwDagp2N8uochsdW7warhHVK5gGhWmLroD+f2ZBgtS2Bs5Ndh18urJmiBbbhvzBhD1N4EeMA9TS2hGlCEdCK5W8ajCq0Dzw/81CcqFJ4ezorXGB6poqogFLtpQJ9FEeP2SyVKhu0GlQ9lggvActxJt34CYQs7aYDNNFijYOgWwnFcIrMVMIv5NAmmqEyvSzPEUNQPCR511UNio6dKQcTCPJpD5mxr1J4B4pQoTaA/os1SKq3E8rbyuYIXUMg03omdgvDGo/arBogQ6KSZxnrNyfPjHuAAnEsoPWY8S8avaWHFrY9/9dN8/JXZQy/vXieT8EGW2f0Es9ucsslLtxl9v3h7/5uPJPI9kvw5uaQ5ffj1DhtcU5x++M9+4YtH8a/PnrnNII2ryQtVln9TPG4C40eGeumSMPWawyz89YjFw3TQ3/idD2NE9Jv+TcLUR5/48pOtf4z/0i9vvtH5y89M3vIg7/M15zoe7/Spx7M9Xyzcqi7S3WM5n3cfYPX2CwbvvsHrzidv79/4aNLjQ5L9hkvxiQddr/C9eNvlG27vH30S5qdn4X77E3V3bpPab3P4PnLJsOvulW7RxG51T725rzvHze8nWb98Hedzl+Lbqsnbrwn4r1wS8F95KPBnH1fzktP5/tFmgNv73a9MzUuXj97ev+YPpuZ3P13Ny8/vvDb4y5fiu6rLIZ6wusm9vDb2LkV4Y9JRNXm2ycLj01T62Hh9eHIxjps78pWpdOkyv73f+4Op9INvptIXL8X3VZN3+W4lFWFjVS6dlRVDXp35CSXecRn3G8fr60YJfuz2/pdeR4mnJdxeDoW4TjWGwY9r91W3Y3337f1zr6/dE7b33jL0Hlie4p5r9ybT/cbgfuQNoPmJS/FXq8m7j65n1XGFXzPZhVtffKrq8I36zyq39296g/n7a6/V8NLlk7f3r399Dd9yk5F7X8OXb1OIrxmspevURVj198bt9y2dPTVX9jP3e3/oUXxUt7yk4I7znDphbj3o/8jBlmvvn3kD2P7WpfjJavIep3BHY7kd8nIG70HS8wef8s2HDR7/3tNgRm6gfo65vX/sK4P50uXrbu8ffFNDuqJ1HfUX30DrX74UvzCufI9p/QDIS+3PPc3jv+byids17ukkdin+wpvw61Mt4DWz+LgVXEf/1Tdz/39yKX5ldIKHjPZq4Sajl14qvvA0lT76iEpPJ7FL8QOv/+V/eG31L95MtH91Kf5pNfnAk8z0iIBPeunz9wnqvoDXezX5wa/smNE3zzHom++ea6sMz/X4qY/fnOC5e+H1u6fQeyVMmyxySdd75CjWxz9x93oGqrz76SdXwG+1Evuzn9nd/dYqCMt7jyx+H//Epz778FDTU7j/+vfckwpdan89z9/AXv/Nm6H7m5fiX4+++nrqPG3+33YZ/92vhfdPfoVHTr4ZApeP43szv48CHFYjoN9699OfUe8+CdFTVpbnb0d4Iqx8/mnI/bs3RO4/vUHd712K36omb7sv4tNAesetYzwJ0k99hTYIQ49jdHME5+6tKdpZFrtWegXrfiyZeR//9PV8zt3LqFeju3LGzdPNgaTr893sM9QI7k2seffj2d3wwQh3L3b5Wqt8/Uge/8M4KvLG/PfICY4bJR4u8P/zDWbr9y/Ff64m73gco6dFbM/fwvnoVN4/cPHBh1N5x7hR6P/11OL/PygvP//XRYo7L70+YnfecSmeHYOqC2KOVVavXLnq1YtNXDXoxuD28uNy2u9rn3J49/ZAuUP8HfeHf5P95Ptf5+DuB19zxP+230998Z1v+8AX9//sej71wWHxF7jJ27w6jh89FffI83N54XrhFeIXbs7IXfG+895q8tar/Jcf77suUC/fN6kPPBqi0Dueu6Xsh5b1cl1c/iHBl/7zB/7Hc2/b/cbtYaHJ3e/499/yH9++/GN/e/5rf9z+zV944S/+jf/yD772t7+lVf/c+See/eyX/2XxfwFMZqEoKEEAAA==";
}

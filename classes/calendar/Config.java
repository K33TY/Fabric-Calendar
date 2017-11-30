package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512077071000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "H4sIAAAAAAAAAK1ZDWwcxRWeO9vnnzh24sTOv+M4Dm1C4iMUUqiT5udsk0suiWU7JDGCy3pvzt54b3ezu2dfAqkCBUILuBIQfiSIEslIBVKgVRElJZQCLaHQ8hPET8Kf2oJAEGiQSoXKT9+b2f9bQ1r1pJ3ZnZk389773nvzZu7wKVJm6KQlK/Trkthq7tKo0drJProE3aCZhCwYRi80p8X3T17bMFS/5WdRUpoi1YIoUsPoUmVJ3GWS2akdUjbOyOOy0E/leEJVsry3DUaLgqIqkijIacUwSU1qhzAsxBVqxjd3J6G/XhFy1NAEkbZTjSoZqogShYG1fGDelOR4DzVhZIWhyZK5QdD8ndDQVtDJHODCEmKdlOUSABO7uACfH3ouc/s27e0oifWRCsnYrBhClqZIpZA3B1VdMkGQSZ5JU5KBS04QVWBaFyTFNHaSH5FYikySoEVQTEkwaaZTV3MmmZfSYKEBWTXjtGDGNUEXcpZCupgSYaYYa7UnqdB0dVjKUN0kc4vU12X1pfALRWuyp7fkK4Jn/9nxW267bNKvSkhtH6mVlB5TMCURYDCBnz5SnaO5fqobqzMZmukjkxVKMz1UlwRZ2g0DVaWP1BnSgCKYeZ0a3dRQ5WEcWGfkNWAR17QbEU+mkrxoqrotTiwrUTljf5VlZWEAEGxw1cLF68R20EUVqJPqWYDcJikdkpQM6iJA4cjYsh4GAGl5jgJezlKlaDwmqePIyYIyEO8xdUkZgKFlat5EBc8cd1K0KTC8IWGApk0yPTiui3fBqEqmCCQxSX1wGJsJUJoZQMmDz6mNy0cvV9YqURIBnjNUlJH/iUDUGCDqplmqgwtQTli9KHWr0HD0uighMLg+MJiPefiK06sWNz5+jI+ZFTJmU/8OKpppcay/5sXZiYUXliAbFZpqSAi+T3Jm/F1WT1tBgwDR4MyIna125+Pdf9y29176YZRUJUlMVOV8DuxosqjmNEmm+kVUoTq6SJJUglcnWH+SlMN7SlIob92UzRrUTJJSmTXFVPYNKsrCFKiianiXlKxqv2uCOcjeCxohZCI8ZAY8JfAstuomk2yIbzbA3OMdaN/9YDDxdmoMmaoW39ChDKTBv1Af8YQgAw+CvoQHvbihi3HRamMxTBpoheCo/b8nLKAE9SORCCh3rqhmaL9gAFKW1azpksEx1qoyRIC0KI8eTZIpR+9gllPphEqcIQpozw5GBi/tLfk1HafvTz/LrQ5pLdVB/LTZauVsASfV6EKtEJdbIS4fjhRaEweS9zFLiRnMpRziSpDhB7IKUxRIJMLEmMqImX0AukMQJyB+Vi/suXTd9uuaAZWCNlIK2ODQZl+cTrjBJMniqggWfXyltn30/FnLo6SsD+Kt0U6zQl42uxJr1LwCcWmq09RNIWQpLFCGButyTWQ0JplWFGZ5eAUy3Z0EyVpAry1BXw5js3bf+589cOse1fVqk7QUBZtiSgwWzUHgdFWkGQi/7vSLmoSH0kf3tLA9txJkM0EyDGiNwTV8QaPNDsAoSxWIl1X1nCBjl62VKnNQV0fcFmaQU7CYxm0TEQ0wyGL3ih7trtf+8sH3oiTqXaXEE03weyqLG5Ndm+jVKYU9/M3bu27ef2rfJcwgYMT8sDVasExAFIH9EpR2zbGdr7/91tjLUdeITNhM8/2QXhTY6g1fwy8Cz1f4YEjABqxhY0hY4ajJiUcmmSKr6lBeQ5dOtqd1mlNNiuyc5TIM4UoGjwZ5jJbNSk7NSFlJ6JcpmvUXtQuWPvTR6CQOuwwtXIk6WfztE7jtM9aQvc9e9q9GNk1ExO3STT/cYTwGT3FnXq3rwi7ko3DlS3PueFq4C3wUIqgh7aYsKBKmJMKAvJAp6DxWXhDoa8NiIXhvsBOWm+X6KPMVyDgkno6kxYZPm+NaZ/s7zAaqRCfVw2lAkgm4tw/YueGcIq9Lut3oB9OCK1mrlF7alPm0qfkSZvwTMtQQdUmz7Qt2gipDykE2CHlHhvksRClTXQdKchIqXVAMGQDnft7LOjsKmo7b+bCgMzS49RbQVh02ujBPS4vfv36frs7/6bKopa4p3NaI54fqWmLX2Dtdw3JGAVLJDI9PTZrYJNuBZQ1odomdbdvsORm3peBeFRokGTlNi71Dm499dFHhA761z2dMOoQeElu2tHhX/W2P1t1302pOMddPUTR6+TmJa9Pn/fLPzLnQzhqDcHRTAfYSjlda/PTACdp9/ucfc/9XR5RgAqvBRiFKmoBJrPWGua/OZkEdrAOuphdZlzX9shsPPnDqra5VzCU8CGOGUpQkWybkhK4Ee93g32Ecflp7Vc1hKS1e1vDC2bMf3fYTr5oCBJ7Ro/fcWf7J4s8PMrEdO5sfsDOH4BttDcvVnF8WcnwAeZn04jSt/s2Xjw2v/TjcDsIoVp479bH3p8+43EIWF9xorYpVdyjYW+Ac5ILd1Jp64nfl3X/ygM0QBBWMsIEcTyzXuwBshYkXhOlzjWqaas6j1RXzT+xo+/LFX9setsnRykK/gAFKr5ixRb+dMXpy7yZ7jh4u6jaPqJfwphVYLAXXrPC6ZJr1dRgYiAIZzFrBGIQ96zX51b79by5q5Kr37GlW/5H2a/bf+puHz+NJTjWEgkkrV/H4wNdP8oWxpC5zS33MhTRtccl2uPAtdeArbuL1PBbFS9ENQg72nXhOc1OM6Mxk7wWHCluYw03gx3onD4pgfulL1gLU4u4V79301U5IUEr6SM2gYCQVSAHwUAlnV9wInC+TTPY4MIuwmKbI3pQreBIKLNYXP3znzMQPP+SJsJMNIfV3QxLhiwVPonbuvbl/Rptjf4iScsgnWZYIB/iLBTmPWUkfnEeNhNWYIhN9/f6zJT9ItTnZ3uxgJuZZNpiHuQk4vONofK8N7C31aDfL4YnBM2rVA969JQLpT5kBiRGjH2GUi1i5GIs4g78EX88xMXPHiwCgyEoKpOvOOhFcZ6o1f9aqezzrAGL2EaEHF9uIJw/fds3shGb4GfTunx++v636nrtZrKhkuALKprU1VyCF/c1FrvOLPNdiYWeYyNx/HYJZYQQ5LwGrfmy5Npb94zrm1Yybfa4XXl3smP6mLQ4js3GuRosBzaoVLyNY3sBd1U81xxqthlEVufiNvqaZkF6wMIQm2cqvO1hHo0mq8WimQdTEpJ/n8hGuDVdMzWFlOrKyEp5KsIgSXpM3gtZWYRsCNt32TQaHxRVY7HEtjeWU06y5T1r1MZ+l1dgLbBC09XQXI93rZ7LZInwvjMmAfTSGEfy1yD4OnpF9HGJKHHON4VCxfRwaxz7QRsk8i4F3rfpvQfu4J2AfjKrJGv33MKoi+7jXbsLyZg/qB13mXdSZw62FB2SO3GDV24KoT4LT0bBMTWfbxa4H/1v0nTiDa2y16g4f+nU2+t2qaoZagBMhkFgMY3i8COElSBdZwCNnZAFHGEpHXbiPFFvAkW+LEMhAv1VvD1rAE+NFCBwthFEVWcCT41nAIy7zAQtYBk8tTHzaql8IWkBZHu+88PuZ/xl2nPh5q37UB/sENvs3441UJ8LYGw9vL8ErRXi/dEZ4H2eYvOKCe7wY7+Pfhjcy8LpVvxrE++R4eOPo18KoivB+Yzy8X2LMF8IBizqAebBiP1RGiaVErKd4VveklexyYM5499zsjn7sqlsOZDbdvZTny3X+u+MOJZ/7xStfPtd6+zvPhNxKVpqqtkSmw1T2rQl5DL+lxEPLrJALU+sKX0w8RcfeXb+4fpzL0ulFf6NYdPcfqK2YdmDzq+yywbmer4HEJZuXZW/e5nmPaTrNSgzQGp7Faaz6OLBjfsK0ONfeuuusrJxt3jyfDN+8C8SvePwIv8n5zJ+YQaK+Ic//d0qL/zh3aftjx8562jo5OhqgBbOV/SNlEbkUDxxYt/Hy08t4KlcmysLu3bjIxBQp5zeJjAe87po37mz2XLG1C/9d82DlAucSBQv7jrFIOo+NhZ1dfH+LpcU7Vz3/xdMDO+F4GoGk3gE7MUhFOL35T/XWNYN/giGy5/qn9tVdCYL2kUrJ6NXzhon/cFWKtkX7Lx7wutr564gJsVJjkSVCgOWzi252fOv57nWeyGtjY7EFWzkq3wme531k7mE3suOOTanyr7fa2rwoNJJFmHZJ4OwZKTuzsyez1cDtLZ50IVCXlZ/4/ZMN218sIdFOUiWrQqZTYNfa4LeDOjUGVTlT0Gw+RiqQK8bRfwAMwcHTaR4AAA==";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            return ((calendar.Config) fetch()).calendar$Config$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.Config) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$cast$calendar_Config(arg1);
        }
        
        public _Proxy(Config._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            ((calendar.Config._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.Config) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() { this.calendar$Config$(); }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof calendar.Config;
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.Config._Impl.jif$Instanceof(o))
                return (calendar.Config) fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.bottomConf(),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            this.$getStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal())));
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.Config) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.Config._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
        }
        
        public _Impl(fabric.worker.Store store, long onum, int version,
                     fabric.worker.Store labelStore, long labelOnum,
                     fabric.worker.Store accessPolicyStore,
                     long accessPolicyOnum, java.io.ObjectInput in,
                     java.util.Iterator refTypes,
                     java.util.Iterator intraStoreRefs,
                     java.util.Iterator interStoreRefs)
              throws java.io.IOException,
            java.lang.ClassNotFoundException {
            super(store, onum, version, labelStore, labelOnum,
                  accessPolicyStore, accessPolicyOnum, in, refTypes,
                  intraStoreRefs, interStoreRefs);
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        public java.lang.String get$calendarStoreName();
        
        public java.lang.String set$calendarStoreName(java.lang.String val);
        
        public java.lang.String get$calendarMapKey();
        
        public java.lang.String set$calendarMapKey(java.lang.String val);
        
        public java.lang.String get$calendarRootMapKey();
        
        public java.lang.String set$calendarRootMapKey(java.lang.String val);
        
        public java.lang.String get$usersMapKey();
        
        public java.lang.String set$usersMapKey(java.lang.String val);
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.Config._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$calendarStoreName() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarStoreName();
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarStoreName(val);
            }
            
            public java.lang.String get$calendarMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarMapKey();
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarMapKey(val);
            }
            
            public java.lang.String get$calendarRootMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarRootMapKey();
            }
            
            public java.lang.String set$calendarRootMapKey(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarRootMapKey(val);
            }
            
            public java.lang.String get$usersMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$usersMapKey();
            }
            
            public java.lang.String set$usersMapKey(java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$usersMapKey(val);
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.Config._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.Config._Static $instance;
            
            static {
                calendar.
                  Config.
                  _Static.
                  _Impl
                  impl =
                  (calendar.Config._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.Config._Static._Impl.class);
                $instance = (calendar.Config._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
            public java.lang.String get$calendarStoreName() {
                return this.calendarStoreName;
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarStoreName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarStoreName;
            
            public java.lang.String get$calendarMapKey() {
                return this.calendarMapKey;
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarMapKey;
            
            public java.lang.String get$calendarRootMapKey() {
                return this.calendarRootMapKey;
            }
            
            public java.lang.String set$calendarRootMapKey(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarRootMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarRootMapKey;
            
            public java.lang.String get$usersMapKey() {
                return this.usersMapKey;
            }
            
            public java.lang.String set$usersMapKey(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.usersMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String usersMapKey;
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return this.jlc$CompilerVersion$fabric;
            }
            
            public java.lang.String jlc$CompilerVersion$fabric;
            
            public long get$jlc$SourceLastModified$fabric() {
                return this.jlc$SourceLastModified$fabric;
            }
            
            public long jlc$SourceLastModified$fabric;
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return this.jlc$ClassType$fabric;
            }
            
            public java.lang.String jlc$ClassType$fabric;
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.calendarStoreName);
                $writeInline(out, this.calendarMapKey);
                $writeInline(out, this.calendarRootMapKey);
                $writeInline(out, this.usersMapKey);
                $writeInline(out, this.jlc$CompilerVersion$fabric);
                out.writeLong(this.jlc$SourceLastModified$fabric);
                $writeInline(out, this.jlc$ClassType$fabric);
            }
            
            public _Impl(fabric.worker.Store store, long onum, int version,
                         fabric.worker.Store labelStore, long labelOnum,
                         fabric.worker.Store accessPolicyStore,
                         long accessPolicyOnum, java.io.ObjectInput in,
                         java.util.Iterator refTypes,
                         java.util.Iterator intraStoreRefs,
                         java.util.Iterator interStoreRefs)
                  throws java.io.IOException,
                java.lang.ClassNotFoundException {
                super(store, onum, version, labelStore, labelOnum,
                      accessPolicyStore, accessPolicyOnum, in, refTypes,
                      intraStoreRefs, interStoreRefs);
                this.calendarStoreName = (java.lang.String) in.readObject();
                this.calendarMapKey = (java.lang.String) in.readObject();
                this.calendarRootMapKey = (java.lang.String) in.readObject();
                this.usersMapKey = (java.lang.String) in.readObject();
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.Config._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm4 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled7 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff5 = 1;
                        boolean $doBackoff6 = true;
                        $label0: for (boolean $commit1 = false; !$commit1; ) {
                            if ($backoffEnabled7) {
                                if ($doBackoff6) {
                                    if ($backoff5 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff5);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e2) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff5 < 5000) $backoff5 *= 2;
                                }
                                $doBackoff6 = $backoff5 <= 32 || !$doBackoff6;
                            }
                            $commit1 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarStoreName("store");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarMapKey("calendar");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarRootMapKey("servletPrincipal");
                                calendar.Config._Static._Proxy.$instance.
                                  set$usersMapKey("users");
                            }
                            catch (final fabric.worker.RetryException $e2) {
                                $commit1 = false;
                                continue $label0;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e2) {
                                $commit1 = false;
                                fabric.common.TransactionID $currentTid3 =
                                  $tm4.getCurrentTid();
                                if ($e2.tid.isDescendantOf($currentTid3))
                                    continue $label0;
                                if ($currentTid3.parent != null) throw $e2;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e2) {
                                $commit1 = false;
                                if ($tm4.checkForStaleObjects())
                                    continue $label0;
                                throw new fabric.worker.AbortException($e2);
                            }
                            finally {
                                if ($commit1) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e2) {
                                        $commit1 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e2) {
                                        $commit1 = false;
                                        fabric.common.TransactionID
                                          $currentTid3 = $tm4.getCurrentTid();
                                        if ($currentTid3 != null) {
                                            if ($e2.tid.equals($currentTid3) ||
                                                  !$e2.tid.isDescendantOf(
                                                             $currentTid3)) {
                                                throw $e2;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit1) {
                                    {  }
                                    continue $label0;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -82, -122, 16, 65, -69,
    -59, -16, -2, 37, -10, -13, 66, 38, 58, -23, 56, -86, -79, 114, 77, -75,
    122, -72, -50, -122, 51, -63, 81, -30, -63, 35, -66 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512077071000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "X/7ilUs/9EXhvxQfPN3+APEyXbpkglXu5JcSJ54vBJFhWoX4l3ffTeyU9g2wxh9hYP7+74vN6tPHcPp0GuXfsb71Fz/0fy5c4r+5Pw4uHXz5E1c7X/36//yrH/3Lv0BfePnPW1/65Yj5yvbf/N4nkK+x3/ra8//2/wP6fWVzXysAAA==";
}

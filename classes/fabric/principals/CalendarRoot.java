package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.worker.Store;
import fabric.util.Map;
import calendar.Config;

/**
*   The Calendar root principal that essentially has all the objects for the Calendar and is the top principal
*   It is the only principal that has integrity rights on final objects, but it doesn't use this except in
*   the possible case that something needs to be instantiated
*
*/
public interface CalendarRoot extends fabric.lang.security.ExternalPrincipal {
    public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
      final java.lang.String name);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511875772000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.CalendarRoot {
        public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
          java.lang.String arg1) {
            return ((fabric.principals.CalendarRoot) fetch()).
              fabric$principals$CalendarRoot$(arg1);
        }
        
        public static fabric.principals.CalendarRoot getInstance() {
            return fabric.principals.CalendarRoot._Impl.getInstance();
        }
        
        public static fabric.principals.CalendarRoot getInstance(
          fabric.worker.Store arg1) {
            return fabric.principals.CalendarRoot._Impl.getInstance(arg1);
        }
        
        public static fabric.principals.CalendarRoot
          jif$cast$fabric_principals_CalendarRoot(fabric.lang.Object arg1) {
            return fabric.principals.CalendarRoot._Impl.
              jif$cast$fabric_principals_CalendarRoot(arg1);
        }
        
        public _Proxy(CalendarRoot._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.CalendarRoot {
        public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
          final java.lang.String name) {
            ((fabric.principals.CalendarRoot._Impl) this.fetch()).jif$init();
            { this.fabric$lang$security$ExternalPrincipal$(name); }
            return (fabric.principals.CalendarRoot) this.$getProxy();
        }
        
        public static fabric.principals.CalendarRoot getInstance() {
            {
                fabric.worker.transaction.TransactionManager $tm87 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled90 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff88 = 1;
                boolean $doBackoff89 = true;
                $label83: for (boolean $commit84 = false; !$commit84; ) {
                    if ($backoffEnabled90) {
                        if ($doBackoff89) {
                            if ($backoff88 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff88);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e85) {
                                        
                                    }
                                }
                            }
                            if ($backoff88 < 5000) $backoff88 *= 2;
                        }
                        $doBackoff89 = $backoff88 <= 32 || !$doBackoff89;
                    }
                    $commit84 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        fabric.worker.Worker w =
                          fabric.worker.Worker.getWorker();
                        if (!fabric.lang.Object._Proxy.idEquals(w, null)) {
                            final fabric.worker.Store
                              store =
                              w.
                              getStore(
                                calendar.Config._Static._Proxy.$instance.
                                    get$calendarStoreName());
                            if (!fabric.lang.Object._Proxy.idEquals(store,
                                                                    null)) {
                                fabric.util.Map rootMap = store.getRoot();
                                if (!fabric.lang.Object._Proxy.idEquals(rootMap,
                                                                        null)) {
                                    fabric.principals.CalendarRoot calRoot =
                                      null;
                                }
                            }
                        }
                        return null;
                    }
                    catch (final fabric.worker.RetryException $e85) {
                        $commit84 = false;
                        continue $label83;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e85) {
                        $commit84 = false;
                        fabric.common.TransactionID $currentTid86 =
                          $tm87.getCurrentTid();
                        if ($e85.tid.isDescendantOf($currentTid86))
                            continue $label83;
                        if ($currentTid86.parent != null) throw $e85;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e85) {
                        $commit84 = false;
                        if ($tm87.checkForStaleObjects()) continue $label83;
                        throw new fabric.worker.AbortException($e85);
                    }
                    finally {
                        if ($commit84) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e85) {
                                $commit84 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e85) {
                                $commit84 = false;
                                fabric.common.TransactionID $currentTid86 =
                                  $tm87.getCurrentTid();
                                if ($currentTid86 != null) {
                                    if ($e85.tid.equals($currentTid86) ||
                                          !$e85.tid.isDescendantOf(
                                                      $currentTid86)) {
                                        throw $e85;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit84) {
                            {  }
                            continue $label83;
                        }
                    }
                }
            }
            return null;
        }
        
        public static fabric.principals.CalendarRoot getInstance(
          final fabric.worker.Store store) {
            return fabric.principals.CalendarRoot._Impl.getInstance();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            o.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof fabric.principals.CalendarRoot;
        }
        
        public static fabric.principals.CalendarRoot
          jif$cast$fabric_principals_CalendarRoot(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.CalendarRoot._Impl.jif$Instanceof(o))
                return (fabric.principals.CalendarRoot)
                         fabric.lang.Object._Proxy.$getProxy(o);
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
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (fabric.principals.CalendarRoot) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.CalendarRoot._Proxy(this);
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
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.CalendarRoot._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.CalendarRoot._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.CalendarRoot._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  CalendarRoot.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.CalendarRoot._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.CalendarRoot._Static._Impl.class);
                $instance = (fabric.principals.CalendarRoot._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.CalendarRoot._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
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
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new fabric.principals.CalendarRoot._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm95 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled98 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff96 = 1;
                        boolean $doBackoff97 = true;
                        $label91: for (boolean $commit92 = false; !$commit92;
                                       ) {
                            if ($backoffEnabled98) {
                                if ($doBackoff97) {
                                    if ($backoff96 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff96);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e93) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff96 < 5000) $backoff96 *= 2;
                                }
                                $doBackoff97 = $backoff96 <= 32 ||
                                                 !$doBackoff97;
                            }
                            $commit92 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e93) {
                                $commit92 = false;
                                continue $label91;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e93) {
                                $commit92 = false;
                                fabric.common.TransactionID $currentTid94 =
                                  $tm95.getCurrentTid();
                                if ($e93.tid.isDescendantOf($currentTid94))
                                    continue $label91;
                                if ($currentTid94.parent != null) throw $e93;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e93) {
                                $commit92 = false;
                                if ($tm95.checkForStaleObjects())
                                    continue $label91;
                                throw new fabric.worker.AbortException($e93);
                            }
                            finally {
                                if ($commit92) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e93) {
                                        $commit92 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e93) {
                                        $commit92 = false;
                                        fabric.common.TransactionID
                                          $currentTid94 = $tm95.getCurrentTid();
                                        if ($currentTid94 != null) {
                                            if ($e93.tid.equals(
                                                           $currentTid94) ||
                                                  !$e93.tid.isDescendantOf(
                                                              $currentTid94)) {
                                                throw $e93;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit92) {
                                    {  }
                                    continue $label91;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 20, -76, 85, 71, -86,
    -97, -16, 34, -101, -75, -128, 59, 37, -102, -22, 91, -111, 93, -107, 116,
    -28, -110, 100, 117, -46, -94, 17, 109, 18, 99, -95, 38 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511875772000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "9hfYfKlxnCSvhpxM8aGLbD7LDF06JMVq4dWz7u6ROqqvMKglsQeJXztLFl87nyy+dobd9hSxq9UsQPl7X4nQZ4+f7tvQdEf25SwHkt1O6mPHMznHz4+9PannKYnv0bevCjduvEtX4xP53ZOilxuNB7bHT/R7QlE10+T42f+OwjtJ97z79swTXSWG757xqTH7xD148BerIvvOPKg19RT1k2fc+Nqd+eqjF77x2Te/8anPHafLTnXn5bcH/S4z2ne7dCEft4GEZLp1vhoevNjpvNRrX7/+8lGQSJEZJF6svlDisS/XPNp7pnK0M7VrpmvGL1w/+vjRqx+lj1677vv3EuOluPHg8QxnYmyc2OBtTKl6P+P792D66/fo+8mq+FTceOgExRpqfZzPqh5M3Li/IuKChCp1ajxzh4Quf/tubP8TcKHgdukcUq5Hh4T90dbzbFVyazGdaKWnvfBqnY89Oiz1ccnZvlZnJA+1Q9K4rh95H0VLwZra0Qve0SuvHLmJbV8/OrjicrQdqTePLahOaJ6gewMvibfZKu0nybIalYd1VbZeuPtyJ4MOb6cjD6+xVze8cMgJH9pKAzu8vnC9quPVtZnacl+4/uLbkHTPNUJVUtSQ9Ep+5d/9Qt4BRlNj2Sj7r5UAx30V7KmcvlucTgecp90/N807o62cY+7Gql6PP6B8/eax/EqRmqcqcXR+O7p+8ztZ8XlnXFvUvf3sk+e15KBf93CzP3MPq/75qvh83Hjsdo2+m20/eKz858375H7Q+07M+qSh6r32PaG5ev3ZGuAX7kHHL1bF344bP1LRIUtRfBwT3jqLEG6dF8ndtpL6Zt+Tdziq+/7994WjOvZQB204qj10rbxRvZXU6F5LfKXEvm4+euWd6f/BfxymO7PRd2RMWy+OPQfxXO0dTpCWPaee5p2h9B39xPfK3Vy/eSyDgwc/IP0nQAi3ees7Z6xbvn+c8g251KZjYkqO11ZASmFcX+2LqqZjZ13RdfOO4Or2k0z9d+VuUdTfv2cU9ZV79P1yVXy5DGvPGWjt4e7mix6/M6z95veTL6oj2jtkUAW26r4Ud32//cYd/ddv3iXs/W4l8yv3lMw/uUffP62Kfxw3rl5AqGr+XHkQefT89lHdjPyhu9yTPr7XLyO/pr75+4sX3/M2d6Tfd8d/WhyP+6UvXn3oB7/I/pv62u/pnf2H8cZDWhkqnr9BeK5+xQ9VzayJePhwn/DAul+PG0/ccak6bjxy9lIT92sH6K/FjStn31H+RX3cqy8MPn0SdTx/19h0kpU+uIx+T7XiHpHI00lY/a/JW//tB//XlYeYrx9f0WscPfUP2emX/sYfPvczX/nkzR/+6//51b/y0c/Hv/c5Jfmdv/mE86T888//P6+061MDMwAA";
}

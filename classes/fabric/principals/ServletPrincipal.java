package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;
import calendar.Config;

/**
*   The Calendar servlet principal that essentially has rights to any writable objects for the Calendar
*   It is has the same rights as the top principal for confidentiality
*/
public interface ServletPrincipal extends fabric.lang.security.ExternalPrincipal
{
    public fabric.principals.ServletPrincipal
      fabric$principals$ServletPrincipal$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512036721000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.ServletPrincipal {
        public fabric.principals.ServletPrincipal
          fabric$principals$ServletPrincipal$() {
            return ((fabric.principals.ServletPrincipal) fetch()).
              fabric$principals$ServletPrincipal$();
        }
        
        public static fabric.principals.ServletPrincipal getInstance() {
            return fabric.principals.ServletPrincipal._Impl.getInstance();
        }
        
        public static fabric.principals.ServletPrincipal getInstance(
          fabric.worker.Store arg1) {
            return fabric.principals.ServletPrincipal._Impl.getInstance(arg1);
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.principals.ServletPrincipal) fetch()).
              jif$invokeDefConstructor();
        }
        
        public static fabric.principals.ServletPrincipal
          jif$cast$fabric_principals_ServletPrincipal(fabric.lang.Object arg1) {
            return fabric.principals.ServletPrincipal._Impl.
              jif$cast$fabric_principals_ServletPrincipal(arg1);
        }
        
        public _Proxy(ServletPrincipal._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.ServletPrincipal {
        public fabric.principals.ServletPrincipal
          fabric$principals$ServletPrincipal$() {
            ((fabric.principals.ServletPrincipal._Impl) this.fetch()).jif$init(
                                                                        );
            { this.fabric$lang$security$ExternalPrincipal$("servlet"); }
            return (fabric.principals.ServletPrincipal) this.$getProxy();
        }
        
        public static fabric.principals.ServletPrincipal getInstance() {
            {
                fabric.worker.transaction.TransactionManager $tm58 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled61 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff59 = 1;
                boolean $doBackoff60 = true;
                $label54: for (boolean $commit55 = false; !$commit55; ) {
                    if ($backoffEnabled61) {
                        if ($doBackoff60) {
                            if ($backoff59 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff59);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e56) {
                                        
                                    }
                                }
                            }
                            if ($backoff59 < 5000) $backoff59 *= 2;
                        }
                        $doBackoff60 = $backoff59 <= 32 || !$doBackoff60;
                    }
                    $commit55 = true;
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
                                    fabric.lang.Object
                                      obj =
                                      rootMap.
                                      get(
                                        fabric.lang.WrappedJavaInlineable.
                                            $wrap(
                                              calendar.Config._Static._Proxy.$instance.
                                                  get$calendarRootMapKey()));
                                }
                            }
                        }
                        return null;
                    }
                    catch (final fabric.worker.RetryException $e56) {
                        $commit55 = false;
                        continue $label54;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e56) {
                        $commit55 = false;
                        fabric.common.TransactionID $currentTid57 =
                          $tm58.getCurrentTid();
                        if ($e56.tid.isDescendantOf($currentTid57))
                            continue $label54;
                        if ($currentTid57.parent != null) throw $e56;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e56) {
                        $commit55 = false;
                        if ($tm58.checkForStaleObjects()) continue $label54;
                        throw new fabric.worker.AbortException($e56);
                    }
                    finally {
                        if ($commit55) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e56) {
                                $commit55 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e56) {
                                $commit55 = false;
                                fabric.common.TransactionID $currentTid57 =
                                  $tm58.getCurrentTid();
                                if ($currentTid57 != null) {
                                    if ($e56.tid.equals($currentTid57) ||
                                          !$e56.tid.isDescendantOf(
                                                      $currentTid57)) {
                                        throw $e56;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit55) {
                            {  }
                            continue $label54;
                        }
                    }
                }
            }
            return null;
        }
        
        public static fabric.principals.ServletPrincipal getInstance(
          final fabric.worker.Store store) {
            return fabric.principals.ServletPrincipal._Impl.getInstance();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.fabric$principals$ServletPrincipal$();
        }
        
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
                  $unwrap(o)) instanceof fabric.principals.ServletPrincipal;
        }
        
        public static fabric.principals.ServletPrincipal
          jif$cast$fabric_principals_ServletPrincipal(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.ServletPrincipal._Impl.jif$Instanceof(o))
                return (fabric.principals.ServletPrincipal)
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
            return (fabric.principals.ServletPrincipal) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.ServletPrincipal._Proxy(this);
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
          implements fabric.principals.ServletPrincipal._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.ServletPrincipal._Static.
                            _Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.ServletPrincipal._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  ServletPrincipal.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.ServletPrincipal._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.ServletPrincipal._Static._Impl.class);
                $instance = (fabric.principals.ServletPrincipal._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.ServletPrincipal._Static {
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
                return new fabric.principals.ServletPrincipal._Static._Proxy(
                         this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm66 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled69 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff67 = 1;
                        boolean $doBackoff68 = true;
                        $label62: for (boolean $commit63 = false; !$commit63;
                                       ) {
                            if ($backoffEnabled69) {
                                if ($doBackoff68) {
                                    if ($backoff67 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff67);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e64) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff67 < 5000) $backoff67 *= 2;
                                }
                                $doBackoff68 = $backoff67 <= 32 ||
                                                 !$doBackoff68;
                            }
                            $commit63 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e64) {
                                $commit63 = false;
                                continue $label62;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e64) {
                                $commit63 = false;
                                fabric.common.TransactionID $currentTid65 =
                                  $tm66.getCurrentTid();
                                if ($e64.tid.isDescendantOf($currentTid65))
                                    continue $label62;
                                if ($currentTid65.parent != null) throw $e64;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e64) {
                                $commit63 = false;
                                if ($tm66.checkForStaleObjects())
                                    continue $label62;
                                throw new fabric.worker.AbortException($e64);
                            }
                            finally {
                                if ($commit63) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e64) {
                                        $commit63 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e64) {
                                        $commit63 = false;
                                        fabric.common.TransactionID
                                          $currentTid65 = $tm66.getCurrentTid();
                                        if ($currentTid65 != null) {
                                            if ($e64.tid.equals(
                                                           $currentTid65) ||
                                                  !$e64.tid.isDescendantOf(
                                                              $currentTid65)) {
                                                throw $e64;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit63) {
                                    {  }
                                    continue $label62;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 24, 56, 98, -111, 102,
    -10, -73, -45, 90, 58, 18, 78, -94, 119, 24, -116, -62, 54, 58, 73, 100, 90,
    64, -19, 65, -61, 65, 98, 61, -110, 77, -35 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512036721000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "Jbj9MtK4fv2Vk02mATDMwtS6dgiCnmxD1zzxXPuqG2zDldW37HNh82vXTz5RBZnfgSZcu37ztetR9PbqehsV79jAsvbTUXQfBv3MfepeL5NPprVn324FVS/hGPYpH2Jae7Bc8wXuVjD09EXi0toffK9yN3a3gILz7HXTkp0nr35sdnKRURdV9lJae+Q4Qn4n/x65F/8+e1/+/e371H2+TH4urT16SmL5/rMXeFPCRHX/507eXP7WvTb8L8CdiDs5cYganxzVTQ9D39KCiiWnaBPa116tQsonh6k+oa3116qg6iF3iHtX+ZPwY0PARNc+uRaefOQjJ0Hm+9dPDhYW9PYT6+YRGauY7Cm5N1iweF8qI5eaYQBRIpaWsbp27+lOOx3ebvc8vKZhVXDtENY+lAHgPLxeu17m2fLmT4XI166/9DZLuu8csaWZVsyHYL+Kdz5ReGhjA3d5CeqvggbHurLtbT69U5pudzi/9ujcMN/Z2sAYVJBaTtX/QPL1m0f+AZa6t0Xi5CLA3g2v9zO0FeLd34Y+c15SDjJ2HxP6S/fR4l8pk7+b1p64U6rvhb2PHBXgvIqfXnN69lS1TwvK2qvflTWXr3+vavDF+6zjS2Xyj9NavVyHoSXp0d2/dWb3bl1ky9u6Cs/cBVgP/KfvCcA6ItVBIk4qVK6EOKnMR0Xu1SwyAfVV8clHvjM9OODIYbgzXf2OlEoP0zRcA6tvf4cD7EDNbcT5zkj6tnjx3YKd6zePPDgg+YHovwBMuAO17x7x4EZ+z4DzDQNI03ExYMcrLeC1OK1uKSZl0RG0y3XdvMuheqee76/f13P6Z/ep++dl8k/BZ8s5Ba1Q7l5Y9NTdju2ffi9hUeXF3sWD0pm1toDd1bX9G3fVX795D1f3nXLmt+7Lma/cp+6rZfKbae3JCwRVri340HzqogkpL3r+4D2ufh//ZcEg/qX15h8zL733ba59P3vXP5Ec+/3qF5589Pu/IP1BdYv59r8jXGFrj9rAbTx/IfJc/uEotmy3WsiVw/XIw/b9m7T29F33xNPaY2cv1QJ/99D699Law2dHZb9ffdJX9x+fO/U+XrynnzrIAQ4DT/js4vnbeyTPZXH5bzRv/ffv/18PPyp+7XjjsHbybFv/m/affen31Fee4X5x9+zP/AvsFcpUf/ib3d/s6h/5zPgP/x9RuPib3jMAAA==";
}

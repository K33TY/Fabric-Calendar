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
                fabric.worker.transaction.TransactionManager $tm20 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled23 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff21 = 1;
                boolean $doBackoff22 = true;
                $label16: for (boolean $commit17 = false; !$commit17; ) {
                    if ($backoffEnabled23) {
                        if ($doBackoff22) {
                            if ($backoff21 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff21);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e18) {
                                        
                                    }
                                }
                            }
                            if ($backoff21 < 5000) $backoff21 *= 2;
                        }
                        $doBackoff22 = $backoff21 <= 32 || !$doBackoff22;
                    }
                    $commit17 = true;
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
                    catch (final fabric.worker.RetryException $e18) {
                        $commit17 = false;
                        continue $label16;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e18) {
                        $commit17 = false;
                        fabric.common.TransactionID $currentTid19 =
                          $tm20.getCurrentTid();
                        if ($e18.tid.isDescendantOf($currentTid19))
                            continue $label16;
                        if ($currentTid19.parent != null) throw $e18;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e18) {
                        $commit17 = false;
                        if ($tm20.checkForStaleObjects()) continue $label16;
                        throw new fabric.worker.AbortException($e18);
                    }
                    finally {
                        if ($commit17) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e18) {
                                $commit17 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e18) {
                                $commit17 = false;
                                fabric.common.TransactionID $currentTid19 =
                                  $tm20.getCurrentTid();
                                if ($currentTid19 != null) {
                                    if ($e18.tid.equals($currentTid19) ||
                                          !$e18.tid.isDescendantOf(
                                                      $currentTid19)) {
                                        throw $e18;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit17) {
                            {  }
                            continue $label16;
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
                        fabric.worker.transaction.TransactionManager $tm28 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled31 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff29 = 1;
                        boolean $doBackoff30 = true;
                        $label24: for (boolean $commit25 = false; !$commit25;
                                       ) {
                            if ($backoffEnabled31) {
                                if ($doBackoff30) {
                                    if ($backoff29 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff29);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e26) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff29 < 5000) $backoff29 *= 2;
                                }
                                $doBackoff30 = $backoff29 <= 32 ||
                                                 !$doBackoff30;
                            }
                            $commit25 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e26) {
                                $commit25 = false;
                                continue $label24;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e26) {
                                $commit25 = false;
                                fabric.common.TransactionID $currentTid27 =
                                  $tm28.getCurrentTid();
                                if ($e26.tid.isDescendantOf($currentTid27))
                                    continue $label24;
                                if ($currentTid27.parent != null) throw $e26;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e26) {
                                $commit25 = false;
                                if ($tm28.checkForStaleObjects())
                                    continue $label24;
                                throw new fabric.worker.AbortException($e26);
                            }
                            finally {
                                if ($commit25) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e26) {
                                        $commit25 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e26) {
                                        $commit25 = false;
                                        fabric.common.TransactionID
                                          $currentTid27 = $tm28.getCurrentTid();
                                        if ($currentTid27 != null) {
                                            if ($e26.tid.equals(
                                                           $currentTid27) ||
                                                  !$e26.tid.isDescendantOf(
                                                              $currentTid27)) {
                                                throw $e26;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit25) {
                                    {  }
                                    continue $label24;
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
      "EtfYnZiGetVwEnevjBX1XLj82vWTT9TB5XdgCdeu33ztuue9vbneRsU7GFjVftrz7iOgn75P3etV8smo8dzbraDutTiGe6oHFzUerNZ8Qbo1DD19kbio8Qffq9INjKSk4Lx4jagS58lHP8aeXBTURZO9FDUeOY6Q3Sm/R+4lv8/eV35/5z51n6+Sn40aj56SWL3/zAXZVDBR3/u5UzaXv3Uvhv8FuAtxpyQO0eKTo7lJrmspolOL5BRtXPXaR+tQ8slhqk+ItvRaHUw95A7x7jp/4n5sUgrRUE+uuScf/vCJE1vW9ZPDDlv2tkLl5hEZ61jsKbk3iHLxFl9FLEVZLlVppCvy/tq9pzvtdHi73fPwGrl1wbVDOPtQVgLn4fXa9SpPVDd+akS+dv2Vt1nSfecIFHGnBIxb8it/5xO5hzaqEsl6WX+1bHCsq9reltM7pel2h/Nr984N852trRxj5kSKVvc/kHz95lF+pUiN2ypxchFg74bX+220NeLdfw995rymHHTsPlvoL93Hin+lSv5u1HjiTq2+F/Y+cjSA8yZ+er3puVPTPi2oaq9+V9Zcvf69usEX77OOL1XJP44azWodshhGR3f/1tm+d+uiWN7WVXjmLsB64D99TwDWEakOGnFSo3KtxGG9fdTkXo29XUl9XXzy4e/MDg44chjuzFa/I6OS3Chy7XLXV7/DAdKy5jbifGckfVu8+G7BzvWbRxkckPxA9F8AIdyB2nePeHAjv2fA+YZcatNxMSXHaytgxCCqbyeGVdERtKt13bzLoXqnnu+v39dz+mf3qfvnVfJPy8+WcwZao9y9sOipux3bP/1ewqLai71LBpUzqySluOvr+jfuqr9+8x6u7juVzG/dVzJfuU/dV6vkN6PGkxcIql3b8kPzqYtbSHXB8wfvceX7+K8K8uhfKm/+8fyV97zNde/n7vrnkWO/X/3Ck49+/xf4P6hvL9/+N4QrRONRtXQbz1+EPJd/2AsU1agXcuVwLfLAvn8TNZ6+63541Hjs7KVe4O8eWv9e1Hj47Kjs9+tP+vre4/On3sfL9/RT0azE4dITPrtw/vYeyfNxUP37zFv//fv/18OPcl873jRsnDzXl/6W+mdf+j3h1WeoX0yf++l/0X11thN++JvD3xxKH/4M+Yf/DyZNLOTWMwAA";
}

package prototype.fabric.util;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.runtime.Runtime;

/**
 * This class is a simple utility class for representing and comparing dates.
 * It is not intended to replace or duplicate the functionality of
 * java.util.Date.
 * It provides precision only to the minute.
 * It is immutable.
 * It provides no way to get the current time.
 */
public interface DateBck extends fabric.lang.Object {
    public prototype.fabric.util.DateBck prototype$fabric$util$DateBck$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511746836000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$prototype_fabric_util_DateBck_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements prototype.fabric.util.DateBck {
        public fabric.lang.security.Label
          get$jif$prototype_fabric_util_DateBck_L() {
            return ((prototype.fabric.util.DateBck._Impl) fetch()).
              get$jif$prototype_fabric_util_DateBck_L();
        }
        
        public prototype.fabric.util.DateBck prototype$fabric$util$DateBck$() {
            return ((prototype.fabric.util.DateBck) fetch()).
              prototype$fabric$util$DateBck$();
        }
        
        public void jif$invokeDefConstructor() {
            ((prototype.fabric.util.DateBck) fetch()).jif$invokeDefConstructor(
                                                        );
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return prototype.fabric.util.DateBck._Impl.jif$Instanceof(arg1,
                                                                      arg2);
        }
        
        public static prototype.fabric.util.DateBck
          jif$cast$prototype_fabric_util_DateBck(
          fabric.lang.security.Label arg1, fabric.lang.Object arg2) {
            return prototype.fabric.util.DateBck._Impl.
              jif$cast$prototype_fabric_util_DateBck(arg1, arg2);
        }
        
        public _Proxy(DateBck._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements prototype.fabric.util.DateBck {
        public prototype.fabric.util.DateBck prototype$fabric$util$DateBck$() {
            ((prototype.fabric.util.DateBck._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (prototype.fabric.util.DateBck) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$prototype_fabric_util_DateBck_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() {
            this.prototype$fabric$util$DateBck$();
        }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof prototype.fabric.util.DateBck) {
                prototype.fabric.util.DateBck c =
                  (prototype.fabric.util.DateBck)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$prototype_fabric_util_DateBck_L(),
                               jif$L);
            }
            return false;
        }
        
        public static prototype.fabric.util.DateBck
          jif$cast$prototype_fabric_util_DateBck(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (prototype.fabric.util.DateBck._Impl.jif$Instanceof(jif$L, o))
                return (prototype.fabric.util.DateBck)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label
          get$jif$prototype_fabric_util_DateBck_L() {
            return this.jif$prototype_fabric_util_DateBck_L;
        }
        
        private fabric.lang.security.Label jif$prototype_fabric_util_DateBck_L;
        
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
            return (prototype.fabric.util.DateBck) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new prototype.fabric.util.DateBck._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$prototype_fabric_util_DateBck_L,
                      refTypes, out, intraStoreRefs, interStoreRefs);
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
            this.jif$prototype_fabric_util_DateBck_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            prototype.fabric.util.DateBck._Impl src =
              (prototype.fabric.util.DateBck._Impl) other;
            this.jif$prototype_fabric_util_DateBck_L =
              src.jif$prototype_fabric_util_DateBck_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements prototype.fabric.util.DateBck._Static {
            public fabric.worker.Worker get$worker$() {
                return ((prototype.fabric.util.DateBck._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((prototype.fabric.util.DateBck._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((prototype.fabric.util.DateBck._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((prototype.fabric.util.DateBck._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(prototype.fabric.util.DateBck._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final prototype.fabric.util.DateBck._Static $instance;
            
            static {
                prototype.
                  fabric.
                  util.
                  DateBck.
                  _Static.
                  _Impl
                  impl =
                  (prototype.fabric.util.DateBck._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      prototype.fabric.util.DateBck._Static._Impl.class);
                $instance = (prototype.fabric.util.DateBck._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements prototype.fabric.util.DateBck._Static {
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
                return new prototype.fabric.util.DateBck._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm12 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled15 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff13 = 1;
                        boolean $doBackoff14 = true;
                        $label8: for (boolean $commit9 = false; !$commit9; ) {
                            if ($backoffEnabled15) {
                                if ($doBackoff14) {
                                    if ($backoff13 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff13);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e10) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff13 < 5000) $backoff13 *= 2;
                                }
                                $doBackoff14 = $backoff13 <= 32 ||
                                                 !$doBackoff14;
                            }
                            $commit9 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
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
                                if ($tm12.checkForStaleObjects())
                                    continue $label8;
                                throw new fabric.worker.AbortException($e10);
                            }
                            finally {
                                if ($commit9) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e10) {
                                        $commit9 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e10) {
                                        $commit9 = false;
                                        fabric.common.TransactionID
                                          $currentTid11 = $tm12.getCurrentTid();
                                        if ($currentTid11 != null) {
                                            if ($e10.tid.equals(
                                                           $currentTid11) ||
                                                  !$e10.tid.isDescendantOf(
                                                              $currentTid11)) {
                                                throw $e10;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit9) {
                                    {  }
                                    continue $label8;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -37, 91, -124, -101,
    -75, 77, 58, 107, 81, -35, -57, -102, 28, 79, -12, -63, 38, 58, 96, 93, 29,
    -58, 20, -13, -121, -66, 56, -113, -21, -118, 72, 78 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511746836000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

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

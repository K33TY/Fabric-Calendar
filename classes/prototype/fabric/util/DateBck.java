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

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

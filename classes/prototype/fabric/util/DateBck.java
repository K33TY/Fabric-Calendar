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

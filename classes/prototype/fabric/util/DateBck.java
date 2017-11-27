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

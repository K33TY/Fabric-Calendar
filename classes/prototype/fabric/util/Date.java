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
public interface Date extends fabric.lang.Object {
    public prototype.fabric.util.Date prototype$fabric$util$Date$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511740925000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$prototype_fabric_util_Date_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements prototype.fabric.util.Date {
        public fabric.lang.security.Label get$jif$prototype_fabric_util_Date_L(
          ) {
            return ((prototype.fabric.util.Date._Impl) fetch()).
              get$jif$prototype_fabric_util_Date_L();
        }
        
        public prototype.fabric.util.Date prototype$fabric$util$Date$() {
            return ((prototype.fabric.util.Date) fetch()).
              prototype$fabric$util$Date$();
        }
        
        public void jif$invokeDefConstructor() {
            ((prototype.fabric.util.Date) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return prototype.fabric.util.Date._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static prototype.fabric.util.Date
          jif$cast$prototype_fabric_util_Date(fabric.lang.security.Label arg1,
                                              fabric.lang.Object arg2) {
            return prototype.fabric.util.Date._Impl.
              jif$cast$prototype_fabric_util_Date(arg1, arg2);
        }
        
        public _Proxy(Date._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements prototype.fabric.util.Date {
        public prototype.fabric.util.Date prototype$fabric$util$Date$() {
            ((prototype.fabric.util.Date._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (prototype.fabric.util.Date) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$prototype_fabric_util_Date_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() {
            this.prototype$fabric$util$Date$();
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
                      $unwrap(o)) instanceof prototype.fabric.util.Date) {
                prototype.fabric.util.Date c =
                  (prototype.fabric.util.Date)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$prototype_fabric_util_Date_L(), jif$L);
            }
            return false;
        }
        
        public static prototype.fabric.util.Date
          jif$cast$prototype_fabric_util_Date(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (prototype.fabric.util.Date._Impl.jif$Instanceof(jif$L, o))
                return (prototype.fabric.util.Date)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$prototype_fabric_util_Date_L(
          ) {
            return this.jif$prototype_fabric_util_Date_L;
        }
        
        private fabric.lang.security.Label jif$prototype_fabric_util_Date_L;
        
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
            return (prototype.fabric.util.Date) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new prototype.fabric.util.Date._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$prototype_fabric_util_Date_L,
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
            this.jif$prototype_fabric_util_Date_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            prototype.fabric.util.Date._Impl src =
              (prototype.fabric.util.Date._Impl) other;
            this.jif$prototype_fabric_util_Date_L =
              src.jif$prototype_fabric_util_Date_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements prototype.fabric.util.Date._Static {
            public fabric.worker.Worker get$worker$() {
                return ((prototype.fabric.util.Date._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((prototype.fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((prototype.fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((prototype.fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(prototype.fabric.util.Date._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final prototype.fabric.util.Date._Static $instance;
            
            static {
                prototype.
                  fabric.
                  util.
                  Date.
                  _Static.
                  _Impl
                  impl =
                  (prototype.fabric.util.Date._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      prototype.fabric.util.Date._Static._Impl.class);
                $instance = (prototype.fabric.util.Date._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements prototype.fabric.util.Date._Static {
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
                return new prototype.fabric.util.Date._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { -83, 22, -82, 10, 112,
    106, -128, -73, 71, 3, 127, -94, -100, -14, 124, -92, 49, -70, -1, -43, 53,
    115, 40, -70, 8, -88, 26, -84, -51, -91, -51, -112 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511740925000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

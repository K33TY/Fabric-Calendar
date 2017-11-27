package prototype.util;

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
    public prototype.util.Date prototype$util$Date$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511736851000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$prototype_util_Date_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements prototype.util.Date {
        public fabric.lang.security.Label get$jif$prototype_util_Date_L() {
            return ((prototype.util.Date._Impl) fetch()).
              get$jif$prototype_util_Date_L();
        }
        
        public prototype.util.Date prototype$util$Date$() {
            return ((prototype.util.Date) fetch()).prototype$util$Date$();
        }
        
        public void jif$invokeDefConstructor() {
            ((prototype.util.Date) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return prototype.util.Date._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static prototype.util.Date jif$cast$prototype_util_Date(
          fabric.lang.security.Label arg1, fabric.lang.Object arg2) {
            return prototype.util.Date._Impl.jif$cast$prototype_util_Date(arg1,
                                                                          arg2);
        }
        
        public _Proxy(Date._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements prototype.util.Date {
        public prototype.util.Date prototype$util$Date$() {
            ((prototype.util.Date._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (prototype.util.Date) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$prototype_util_Date_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() { this.prototype$util$Date$(); }
        
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
                      $unwrap(o)) instanceof prototype.util.Date) {
                prototype.util.Date c =
                  (prototype.util.Date) fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$prototype_util_Date_L(), jif$L);
            }
            return false;
        }
        
        public static prototype.util.Date jif$cast$prototype_util_Date(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (prototype.util.Date._Impl.jif$Instanceof(jif$L, o))
                return (prototype.util.Date)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$prototype_util_Date_L() {
            return this.jif$prototype_util_Date_L;
        }
        
        private fabric.lang.security.Label jif$prototype_util_Date_L;
        
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
            return (prototype.util.Date) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new prototype.util.Date._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$prototype_util_Date_L, refTypes,
                      out, intraStoreRefs, interStoreRefs);
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
            this.jif$prototype_util_Date_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            prototype.util.Date._Impl src = (prototype.util.Date._Impl) other;
            this.jif$prototype_util_Date_L = src.jif$prototype_util_Date_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements prototype.util.Date._Static {
            public fabric.worker.Worker get$worker$() {
                return ((prototype.util.Date._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((prototype.util.Date._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((prototype.util.Date._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((prototype.util.Date._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(prototype.util.Date._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final prototype.util.Date._Static $instance;
            
            static {
                prototype.
                  util.
                  Date.
                  _Static.
                  _Impl
                  impl =
                  (prototype.util.Date._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      prototype.util.Date._Static._Impl.class);
                $instance = (prototype.util.Date._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements prototype.util.Date._Static {
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
                return new prototype.util.Date._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { 61, 75, -70, 63, -105,
    60, 122, 107, -10, 114, 30, -19, -121, -40, -95, 31, -19, 76, 11, 42, 27,
    113, 60, 40, -75, 88, -65, 35, 42, 15, 91, 71 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511736851000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

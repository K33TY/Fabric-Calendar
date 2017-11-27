package fabric.util;

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
    public fabric.util.Date fabric$util$Date$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511701668000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$fabric_util_Date_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements fabric.util.Date {
        public fabric.lang.security.Label get$jif$fabric_util_Date_L() {
            return ((fabric.util.Date._Impl) fetch()).
              get$jif$fabric_util_Date_L();
        }
        
        public fabric.util.Date fabric$util$Date$() {
            return ((fabric.util.Date) fetch()).fabric$util$Date$();
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.util.Date) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return fabric.util.Date._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static fabric.util.Date jif$cast$fabric_util_Date(
          fabric.lang.security.Label arg1, fabric.lang.Object arg2) {
            return fabric.util.Date._Impl.jif$cast$fabric_util_Date(arg1, arg2);
        }
        
        public _Proxy(Date._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements fabric.util.Date {
        public fabric.util.Date fabric$util$Date$() {
            ((fabric.util.Date._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (fabric.util.Date) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$fabric_util_Date_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() { this.fabric$util$Date$(); }
        
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
                      $unwrap(o)) instanceof fabric.util.Date) {
                fabric.util.Date c = (fabric.util.Date)
                                       fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$fabric_util_Date_L(), jif$L);
            }
            return false;
        }
        
        public static fabric.util.Date jif$cast$fabric_util_Date(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.util.Date._Impl.jif$Instanceof(jif$L, o))
                return (fabric.util.Date)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$fabric_util_Date_L() {
            return this.jif$fabric_util_Date_L;
        }
        
        private fabric.lang.security.Label jif$fabric_util_Date_L;
        
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
            return (fabric.util.Date) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.util.Date._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$fabric_util_Date_L, refTypes, out,
                      intraStoreRefs, interStoreRefs);
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
            this.jif$fabric_util_Date_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            fabric.util.Date._Impl src = (fabric.util.Date._Impl) other;
            this.jif$fabric_util_Date_L = src.jif$fabric_util_Date_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.util.Date._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.util.Date._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.util.Date._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.util.Date._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.util.Date._Static $instance;
            
            static {
                fabric.
                  util.
                  Date.
                  _Static.
                  _Impl
                  impl =
                  (fabric.util.Date._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(fabric.util.Date._Static._Impl.class);
                $instance = (fabric.util.Date._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.util.Date._Static {
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
                return new fabric.util.Date._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { 51, 18, -123, -57, 59,
    -46, 82, -47, 109, 12, 80, -18, 64, 70, -93, 65, -70, -10, -79, 71, 55, 20,
    -68, -46, 104, 87, -89, -19, -85, -57, -31, -70 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511701668000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

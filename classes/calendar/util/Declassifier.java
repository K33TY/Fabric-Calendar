package calendar.util;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
/**
*   A class to transfer confidentiality and/or integrity rights between principals
*
*/
public interface Declassifier extends fabric.lang.Object {
    public calendar.util.Declassifier calendar$util$Declassifier$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510972468000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.util.Declassifier {
        public calendar.util.Declassifier calendar$util$Declassifier$() {
            return ((calendar.util.Declassifier) fetch()).
              calendar$util$Declassifier$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.util.Declassifier) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.util.Declassifier._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.util.Declassifier
          jif$cast$calendar_util_Declassifier(fabric.lang.Object arg1) {
            return calendar.util.Declassifier._Impl.
              jif$cast$calendar_util_Declassifier(arg1);
        }
        
        public _Proxy(Declassifier._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.util.Declassifier {
        public calendar.util.Declassifier calendar$util$Declassifier$() {
            ((calendar.util.Declassifier._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.util.Declassifier) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.calendar$util$Declassifier$();
        }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof calendar.util.Declassifier;
        }
        
        public static calendar.util.Declassifier
          jif$cast$calendar_util_Declassifier(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.util.Declassifier._Impl.jif$Instanceof(o))
                return (calendar.util.Declassifier)
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
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.util.Declassifier) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.util.Declassifier._Proxy(this);
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
          implements calendar.util.Declassifier._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.util.Declassifier._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.util.Declassifier._Static $instance;
            
            static {
                calendar.
                  util.
                  Declassifier.
                  _Static.
                  _Impl
                  impl =
                  (calendar.util.Declassifier._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.util.Declassifier._Static._Impl.class);
                $instance = (calendar.util.Declassifier._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.util.Declassifier._Static {
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
                return new calendar.util.Declassifier._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm50 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled53 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff51 = 1;
                        boolean $doBackoff52 = true;
                        $label46: for (boolean $commit47 = false; !$commit47;
                                       ) {
                            if ($backoffEnabled53) {
                                if ($doBackoff52) {
                                    if ($backoff51 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff51);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e48) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff51 < 5000) $backoff51 *= 2;
                                }
                                $doBackoff52 = $backoff51 <= 32 ||
                                                 !$doBackoff52;
                            }
                            $commit47 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e48) {
                                $commit47 = false;
                                continue $label46;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e48) {
                                $commit47 = false;
                                fabric.common.TransactionID $currentTid49 =
                                  $tm50.getCurrentTid();
                                if ($e48.tid.isDescendantOf($currentTid49))
                                    continue $label46;
                                if ($currentTid49.parent != null) throw $e48;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e48) {
                                $commit47 = false;
                                if ($tm50.checkForStaleObjects())
                                    continue $label46;
                                throw new fabric.worker.AbortException($e48);
                            }
                            finally {
                                if ($commit47) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e48) {
                                        $commit47 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e48) {
                                        $commit47 = false;
                                        fabric.common.TransactionID
                                          $currentTid49 = $tm50.getCurrentTid();
                                        if ($currentTid49 != null) {
                                            if ($e48.tid.equals(
                                                           $currentTid49) ||
                                                  !$e48.tid.isDescendantOf(
                                                              $currentTid49)) {
                                                throw $e48;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit47) {
                                    {  }
                                    continue $label46;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 99, -47, -118, -104,
    64, -52, -40, -118, -127, -58, -60, 102, 62, -121, -93, 85, -7, 123, 2, -32,
    -16, -5, 45, -32, -126, 62, 113, -106, -120, -100, 26, 37 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510972468000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

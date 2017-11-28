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
                        fabric.worker.transaction.TransactionManager $tm79 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled82 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff80 = 1;
                        boolean $doBackoff81 = true;
                        $label75: for (boolean $commit76 = false; !$commit76;
                                       ) {
                            if ($backoffEnabled82) {
                                if ($doBackoff81) {
                                    if ($backoff80 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff80);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e77) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff80 < 5000) $backoff80 *= 2;
                                }
                                $doBackoff81 = $backoff80 <= 32 ||
                                                 !$doBackoff81;
                            }
                            $commit76 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e77) {
                                $commit76 = false;
                                continue $label75;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e77) {
                                $commit76 = false;
                                fabric.common.TransactionID $currentTid78 =
                                  $tm79.getCurrentTid();
                                if ($e77.tid.isDescendantOf($currentTid78))
                                    continue $label75;
                                if ($currentTid78.parent != null) throw $e77;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e77) {
                                $commit76 = false;
                                if ($tm79.checkForStaleObjects())
                                    continue $label75;
                                throw new fabric.worker.AbortException($e77);
                            }
                            finally {
                                if ($commit76) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e77) {
                                        $commit76 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e77) {
                                        $commit76 = false;
                                        fabric.common.TransactionID
                                          $currentTid78 = $tm79.getCurrentTid();
                                        if ($currentTid78 != null) {
                                            if ($e77.tid.equals(
                                                           $currentTid78) ||
                                                  !$e77.tid.isDescendantOf(
                                                              $currentTid78)) {
                                                throw $e77;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit76) {
                                    {  }
                                    continue $label75;
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

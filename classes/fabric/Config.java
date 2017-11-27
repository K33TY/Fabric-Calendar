package fabric;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public fabric.Config fabric$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements fabric.Config {
        public fabric.Config fabric$Config$() {
            return ((fabric.Config) fetch()).fabric$Config$();
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.Config) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return fabric.Config._Impl.jif$Instanceof(arg1);
        }
        
        public static fabric.Config jif$cast$fabric_Config(
          fabric.lang.Object arg1) {
            return fabric.Config._Impl.jif$cast$fabric_Config(arg1);
        }
        
        public _Proxy(Config._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements fabric.Config {
        public fabric.Config fabric$Config$() {
            ((fabric.Config._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (fabric.Config) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() { this.fabric$Config$(); }
        
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
                  $unwrap(o)) instanceof fabric.Config;
        }
        
        public static fabric.Config jif$cast$fabric_Config(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.Config._Impl.jif$Instanceof(o))
                return (fabric.Config) fabric.lang.Object._Proxy.$getProxy(o);
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
            return (fabric.Config) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.Config._Proxy(this);
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
        
        public java.lang.String get$helloStoreName();
        
        public java.lang.String set$helloStoreName(java.lang.String val);
        
        public java.lang.String get$helloServPrincipalMapKey();
        
        public java.lang.String set$helloServPrincipalMapKey(
          java.lang.String val);
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.Config._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.Config._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$helloStoreName() {
                return ((fabric.Config._Static._Impl) fetch()).
                  get$helloStoreName();
            }
            
            public java.lang.String set$helloStoreName(java.lang.String val) {
                return ((fabric.Config._Static._Impl) fetch()).
                  set$helloStoreName(val);
            }
            
            public java.lang.String get$helloServPrincipalMapKey() {
                return ((fabric.Config._Static._Impl) fetch()).
                  get$helloServPrincipalMapKey();
            }
            
            public java.lang.String set$helloServPrincipalMapKey(
              java.lang.String val) {
                return ((fabric.Config._Static._Impl) fetch()).
                  set$helloServPrincipalMapKey(val);
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.Config._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.Config._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.Config._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.Config._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.Config._Static $instance;
            
            static {
                fabric.
                  Config.
                  _Static.
                  _Impl
                  impl =
                  (fabric.Config._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(fabric.Config._Static._Impl.class);
                $instance = (fabric.Config._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.Config._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
            public java.lang.String get$helloStoreName() {
                return this.helloStoreName;
            }
            
            public java.lang.String set$helloStoreName(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.helloStoreName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String helloStoreName;
            
            public java.lang.String get$helloServPrincipalMapKey() {
                return this.helloServPrincipalMapKey;
            }
            
            public java.lang.String set$helloServPrincipalMapKey(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.helloServPrincipalMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            /**
   * The key in the root map for finding the airline principal.
   */
            public java.lang.String helloServPrincipalMapKey;
            
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
                $writeInline(out, this.helloStoreName);
                $writeInline(out, this.helloServPrincipalMapKey);
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
                this.helloStoreName = (java.lang.String) in.readObject();
                this.helloServPrincipalMapKey = (java.lang.String)
                                                  in.readObject();
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new fabric.Config._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm62 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled65 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff63 = 1;
                        boolean $doBackoff64 = true;
                        $label58: for (boolean $commit59 = false; !$commit59;
                                       ) {
                            if ($backoffEnabled65) {
                                if ($doBackoff64) {
                                    if ($backoff63 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff63);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e60) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff63 < 5000) $backoff63 *= 2;
                                }
                                $doBackoff64 = $backoff63 <= 32 ||
                                                 !$doBackoff64;
                            }
                            $commit59 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                                fabric.Config._Static._Proxy.$instance.
                                  set$helloStoreName("backend");
                                fabric.Config._Static._Proxy.$instance.
                                  set$helloServPrincipalMapKey("hello");
                            }
                            catch (final fabric.worker.RetryException $e60) {
                                $commit59 = false;
                                continue $label58;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e60) {
                                $commit59 = false;
                                fabric.common.TransactionID $currentTid61 =
                                  $tm62.getCurrentTid();
                                if ($e60.tid.isDescendantOf($currentTid61))
                                    continue $label58;
                                if ($currentTid61.parent != null) throw $e60;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e60) {
                                $commit59 = false;
                                if ($tm62.checkForStaleObjects())
                                    continue $label58;
                                throw new fabric.worker.AbortException($e60);
                            }
                            finally {
                                if ($commit59) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e60) {
                                        $commit59 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e60) {
                                        $commit59 = false;
                                        fabric.common.TransactionID
                                          $currentTid61 = $tm62.getCurrentTid();
                                        if ($currentTid61 != null) {
                                            if ($e60.tid.equals(
                                                           $currentTid61) ||
                                                  !$e60.tid.isDescendantOf(
                                                              $currentTid61)) {
                                                throw $e60;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit59) {
                                    {  }
                                    continue $label58;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -50, -32, 6, 89, 56,
    -97, 11, 20, -94, 52, 118, -66, -29, 64, -46, -71, 104, 104, 53, -98, 69,
    58, -67, -72, -32, 83, 111, 106, -84, 87, 75, 45 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

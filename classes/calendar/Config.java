package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512018345000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            return ((calendar.Config) fetch()).calendar$Config$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.Config) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$cast$calendar_Config(arg1);
        }
        
        public _Proxy(Config._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            ((calendar.Config._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.Config) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() { this.calendar$Config$(); }
        
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
                  $unwrap(o)) instanceof calendar.Config;
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.Config._Impl.jif$Instanceof(o))
                return (calendar.Config) fabric.lang.Object._Proxy.$getProxy(o);
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
            return (calendar.Config) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.Config._Proxy(this);
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
        
        public java.lang.String get$calendarStoreName();
        
        public java.lang.String set$calendarStoreName(java.lang.String val);
        
        public java.lang.String get$calendarMapKey();
        
        public java.lang.String set$calendarMapKey(java.lang.String val);
        
        public java.lang.String get$calendarPrincipalMapKey();
        
        public java.lang.String set$calendarPrincipalMapKey(
          java.lang.String val);
        
        public java.lang.String get$usersMapKey();
        
        public java.lang.String set$usersMapKey(java.lang.String val);
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.Config._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$calendarStoreName() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarStoreName();
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarStoreName(val);
            }
            
            public java.lang.String get$calendarMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarMapKey();
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarMapKey(val);
            }
            
            public java.lang.String get$calendarPrincipalMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarPrincipalMapKey();
            }
            
            public java.lang.String set$calendarPrincipalMapKey(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarPrincipalMapKey(val);
            }
            
            public java.lang.String get$usersMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$usersMapKey();
            }
            
            public java.lang.String set$usersMapKey(java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$usersMapKey(val);
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.Config._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.Config._Static $instance;
            
            static {
                calendar.
                  Config.
                  _Static.
                  _Impl
                  impl =
                  (calendar.Config._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.Config._Static._Impl.class);
                $instance = (calendar.Config._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
            public java.lang.String get$calendarStoreName() {
                return this.calendarStoreName;
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarStoreName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarStoreName;
            
            public java.lang.String get$calendarMapKey() {
                return this.calendarMapKey;
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarMapKey;
            
            public java.lang.String get$calendarPrincipalMapKey() {
                return this.calendarPrincipalMapKey;
            }
            
            public java.lang.String set$calendarPrincipalMapKey(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarPrincipalMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarPrincipalMapKey;
            
            public java.lang.String get$usersMapKey() {
                return this.usersMapKey;
            }
            
            public java.lang.String set$usersMapKey(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.usersMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String usersMapKey;
            
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
                $writeInline(out, this.calendarStoreName);
                $writeInline(out, this.calendarMapKey);
                $writeInline(out, this.calendarPrincipalMapKey);
                $writeInline(out, this.usersMapKey);
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
                this.calendarStoreName = (java.lang.String) in.readObject();
                this.calendarMapKey = (java.lang.String) in.readObject();
                this.calendarPrincipalMapKey = (java.lang.String)
                                                 in.readObject();
                this.usersMapKey = (java.lang.String) in.readObject();
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.Config._Static._Proxy(this);
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
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarStoreName("store");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarMapKey("calendar");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarPrincipalMapKey(
                                    "servletPrincipal");
                                calendar.Config._Static._Proxy.$instance.
                                  set$usersMapKey("users");
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
    
    public static final byte[] $classHash = new byte[] { 45, -90, -47, -9, 69,
    37, -25, 61, -18, -68, -7, 126, 17, -126, 47, -106, 117, 55, 52, -128, 22,
    36, -89, 37, -44, 32, -90, -92, 100, 91, 80, -96 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512018345000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "GeiKCta7k99OnHi+5AWKqhfiX919SbFT2rfBkn+Ehvn7vyp2sc8eA+uzcZB/y/rO//zI/750Zfqd/dkwdPDyz/7mH+Gf/L1X/8c//T9fePKL8NfiRvWND9/45id/6+Bn35ZfG/2t/w+yHzzZYysAAA==";
}

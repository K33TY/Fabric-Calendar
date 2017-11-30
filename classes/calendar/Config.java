package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512077071000L;
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
        
        public java.lang.String get$calendarRootMapKey();
        
        public java.lang.String set$calendarRootMapKey(java.lang.String val);
        
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
            
            public java.lang.String get$calendarRootMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarRootMapKey();
            }
            
            public java.lang.String set$calendarRootMapKey(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarRootMapKey(val);
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
            
            public java.lang.String get$calendarRootMapKey() {
                return this.calendarRootMapKey;
            }
            
            public java.lang.String set$calendarRootMapKey(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarRootMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarRootMapKey;
            
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
                $writeInline(out, this.calendarRootMapKey);
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
                this.calendarRootMapKey = (java.lang.String) in.readObject();
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
                                  set$calendarRootMapKey("servletPrincipal");
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
    
    public static final byte[] $classHash = new byte[] { -82, -122, 16, 65, -69,
    -59, -16, -2, 37, -10, -13, 66, 38, 58, -23, 56, -86, -79, 114, 77, -75,
    122, -72, -50, -122, 51, -63, 81, -30, -63, 35, -66 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512077071000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "ZRq6pIGV7eQdiBP5C66vanrB/uXdjYid0L4OVvQj3Mu//7DYjj59DKFPR35+H/XNv/6e/33h0uQb+4Ne6OBLn7iKfeVr/+Nvv/9v/rr9wst/1fzir/vMl7N/9UefqH119Odfff63/h9Zx5QVJysAAA==";
}

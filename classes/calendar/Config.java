package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512023189000L;
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
    
    public static final byte[] $classHash = new byte[] { 50, -89, 13, -6, -68,
    11, 88, -97, 18, 53, -29, 35, 67, 45, -39, 46, 35, -62, 120, 43, -11, 58,
    122, 74, 54, -77, 113, -103, -124, -106, 44, -5 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512023189000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "V65d+Z6vTP9VeaXp7hXDq2zlipGvcqdvR5zKXwoi3bBK9q/u70rshfaNfI0/xsDi+x+Xm9XnT+D0+SQqbqq+89++539euiJ+8+gIuHJQ/9oH/tfffWLxl59B/8PL5Gu/ffjyP8ig3399R2O/FH75h7/06v/+/wpCREJBKwAA";
}

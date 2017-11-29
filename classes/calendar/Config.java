package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511911753000L;
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
    
    public static final byte[] $classHash = new byte[] { 3, -74, 35, 115, 105,
    -44, -78, 109, 56, 86, 116, 2, -118, -28, 16, 72, 52, -109, -75, -62, -87,
    27, 75, 47, -49, -109, 102, 80, -91, 19, 0, 91 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511911753000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

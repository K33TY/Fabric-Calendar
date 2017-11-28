package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511009793000L;
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
        
        public java.lang.String get$calendarRootMapKey();
        
        public java.lang.String set$calendarRootMapKey(java.lang.String val);
        
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
            
            public java.lang.String get$calendarRootMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarRootMapKey();
            }
            
            public java.lang.String set$calendarRootMapKey(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarRootMapKey(val);
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
                $writeInline(out, this.calendarRootMapKey);
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
                this.calendarRootMapKey = (java.lang.String) in.readObject();
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
                                  set$calendarRootMapKey("rootPrincipal");
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
    
    public static final byte[] $classHash = new byte[] { -48, 84, 84, 10, 25,
    -87, -51, -28, -53, -40, -56, 82, -21, 55, 3, 124, 72, 127, 0, -87, -81, 92,
    115, -110, 118, 44, -60, 70, -26, 43, 11, -112 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511009793000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "K9vpbyFOPV/yA90wC/Gv7r6M2CntG2BFP8K9/P1Piu3osycQ+mwc5N+lvvnf3ve/Ll2RvrU/5IUO/rkkPfr+L//Jn3/9m18Tv9N86EfJvwV9+Ss/En42een3if9Ueuzn/h8AZxJQLysAAA==";
}

package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Calendar extends fabric.lang.security.AbstractPrincipal {
    public fabric.principals.Calendar fabric$principals$Calendar$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512078569000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Principal get$jif$fabric_principals_Calendar_p(
      );
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.AbstractPrincipal._Proxy
      implements fabric.principals.Calendar {
        public fabric.lang.security.Principal
          get$jif$fabric_principals_Calendar_p() {
            return ((fabric.principals.Calendar._Impl) fetch()).
              get$jif$fabric_principals_Calendar_p();
        }
        
        public fabric.principals.Calendar fabric$principals$Calendar$() {
            return ((fabric.principals.Calendar) fetch()).
              fabric$principals$Calendar$();
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.principals.Calendar) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return fabric.principals.Calendar._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static fabric.principals.Calendar
          jif$cast$fabric_principals_Calendar(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return fabric.principals.Calendar._Impl.
              jif$cast$fabric_principals_Calendar(arg1, arg2);
        }
        
        public _Proxy(Calendar._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.AbstractPrincipal._Impl
      implements fabric.principals.Calendar {
        public fabric.principals.Calendar fabric$principals$Calendar$() {
            ((fabric.principals.Calendar._Impl) this.fetch()).jif$init();
            { this.fabric$lang$security$AbstractPrincipal$("calendar"); }
            return (fabric.principals.Calendar) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Principal jif$p) {
            super($location);
            this.jif$fabric_principals_Calendar_p = jif$p;
        }
        
        public void jif$invokeDefConstructor() {
            this.fabric$principals$Calendar$();
        }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            o.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof fabric.principals.Calendar) {
                fabric.principals.Calendar c =
                  (fabric.principals.Calendar)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.PrincipalUtil._Impl.
                  equivalentTo(c.get$jif$fabric_principals_Calendar_p(), jif$p);
            }
            return false;
        }
        
        public static fabric.principals.Calendar
          jif$cast$fabric_principals_Calendar(
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.Calendar._Impl.jif$Instanceof(jif$p, o))
                return (fabric.principals.Calendar)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal
          get$jif$fabric_principals_Calendar_p() {
            return this.jif$fabric_principals_Calendar_p;
        }
        
        private fabric.lang.security.Principal jif$fabric_principals_Calendar_p;
        
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
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (fabric.principals.Calendar) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.Calendar._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$fabric_principals_Calendar_p,
                      refTypes, out, intraStoreRefs, interStoreRefs);
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
            this.jif$fabric_principals_Calendar_p =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            fabric.principals.Calendar._Impl src =
              (fabric.principals.Calendar._Impl) other;
            this.jif$fabric_principals_Calendar_p =
              src.jif$fabric_principals_Calendar_p;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.Calendar._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.Calendar._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.Calendar._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.Calendar._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.Calendar._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.Calendar._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.Calendar._Static $instance;
            
            static {
                fabric.
                  principals.
                  Calendar.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.Calendar._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.Calendar._Static._Impl.class);
                $instance = (fabric.principals.Calendar._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.Calendar._Static {
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
                return new fabric.principals.Calendar._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm123 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled126 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff124 = 1;
                        boolean $doBackoff125 = true;
                        $label119: for (boolean $commit120 = false; !$commit120;
                                        ) {
                            if ($backoffEnabled126) {
                                if ($doBackoff125) {
                                    if ($backoff124 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff124);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e121) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff124 < 5000) $backoff124 *= 2;
                                }
                                $doBackoff125 = $backoff124 <= 32 ||
                                                  !$doBackoff125;
                            }
                            $commit120 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e121) {
                                $commit120 = false;
                                continue $label119;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e121) {
                                $commit120 = false;
                                fabric.common.TransactionID $currentTid122 =
                                  $tm123.getCurrentTid();
                                if ($e121.tid.isDescendantOf($currentTid122))
                                    continue $label119;
                                if ($currentTid122.parent != null) throw $e121;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e121) {
                                $commit120 = false;
                                if ($tm123.checkForStaleObjects())
                                    continue $label119;
                                throw new fabric.worker.AbortException($e121);
                            }
                            finally {
                                if ($commit120) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e121) {
                                        $commit120 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e121) {
                                        $commit120 = false;
                                        fabric.common.TransactionID
                                          $currentTid122 =
                                          $tm123.getCurrentTid();
                                        if ($currentTid122 != null) {
                                            if ($e121.tid.equals(
                                                            $currentTid122) ||
                                                  !$e121.tid.
                                                  isDescendantOf(
                                                    $currentTid122)) {
                                                throw $e121;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit120) {
                                    {  }
                                    continue $label119;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 111, 121, 44, 32, 127,
    -51, 83, 55, 3, -36, -9, 46, -97, 118, 117, 14, 98, 46, -54, -119, 108,
    -113, -77, -86, 75, -54, 3, -95, -10, -29, 116, 14 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512078569000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "9tUQeubcF5kh9OTJS7Gxf7yj/ichdO0k5/NLRZag+Gjo+aOQ45UL46VzFnFJGPJ85Oefo7/1P77/f127wX19/5kOdOCk9w9+5F+w+GP/8Q8P/+Y2uiUe/spfND/zC18c/Mpjf/sP/kt46/8Bi+CHHSYvAAA=";
}

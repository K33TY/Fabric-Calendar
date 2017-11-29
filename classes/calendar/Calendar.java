package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;
import fabricated.util.HashMap;

public interface Calendar extends fabric.lang.security.AbstractPrincipal {
    public calendar.Calendar calendar$Calendar$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511979541000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Principal get$jif$calendar_Calendar_p();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.AbstractPrincipal._Proxy
      implements calendar.Calendar {
        public fabric.lang.security.Principal get$jif$calendar_Calendar_p() {
            return ((calendar.Calendar._Impl) fetch()).
              get$jif$calendar_Calendar_p();
        }
        
        public calendar.Calendar calendar$Calendar$() {
            return ((calendar.Calendar) fetch()).calendar$Calendar$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.Calendar) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return calendar.Calendar._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static calendar.Calendar jif$cast$calendar_Calendar(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return calendar.Calendar._Impl.jif$cast$calendar_Calendar(arg1,
                                                                      arg2);
        }
        
        public _Proxy(Calendar._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.AbstractPrincipal._Impl
      implements calendar.Calendar {
        public calendar.Calendar calendar$Calendar$() {
            ((calendar.Calendar._Impl) this.fetch()).jif$init();
            { this.fabric$lang$security$AbstractPrincipal$("calendar"); }
            return (calendar.Calendar) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Principal jif$p) {
            super($location);
            this.jif$calendar_Calendar_p = jif$p;
        }
        
        public void jif$invokeDefConstructor() { this.calendar$Calendar$(); }
        
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
                      $unwrap(o)) instanceof calendar.Calendar) {
                calendar.Calendar c = (calendar.Calendar)
                                        fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.PrincipalUtil._Impl.
                  equivalentTo(c.get$jif$calendar_Calendar_p(), jif$p);
            }
            return false;
        }
        
        public static calendar.Calendar jif$cast$calendar_Calendar(
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.Calendar._Impl.jif$Instanceof(jif$p, o))
                return (calendar.Calendar)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal get$jif$calendar_Calendar_p() {
            return this.jif$calendar_Calendar_p;
        }
        
        private fabric.lang.security.Principal jif$calendar_Calendar_p;
        
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
            return (calendar.Calendar) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.Calendar._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_Calendar_p, refTypes, out,
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
            this.jif$calendar_Calendar_p =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.Calendar._Impl src = (calendar.Calendar._Impl) other;
            this.jif$calendar_Calendar_p = src.jif$calendar_Calendar_p;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.Calendar._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.Calendar._Static._Impl) fetch()).get$worker$(
                                                                     );
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.Calendar._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.Calendar._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.Calendar._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.Calendar._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.Calendar._Static $instance;
            
            static {
                calendar.
                  Calendar.
                  _Static.
                  _Impl
                  impl =
                  (calendar.Calendar._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.Calendar._Static._Impl.class);
                $instance = (calendar.Calendar._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.Calendar._Static {
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
                return new calendar.Calendar._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { 12, -26, 41, 33, -82,
    96, -89, 97, -116, -63, 26, -11, -55, -13, -28, -123, 72, 31, 47, 117, 4,
    -20, 90, 67, -119, 116, -27, -31, 109, -23, -125, -30 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511979541000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

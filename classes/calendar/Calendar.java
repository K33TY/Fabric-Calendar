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
    public static final long jlc$SourceLastModified$fabric = 1511920871000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Principal get$jif$calendar_Calendar_servletP();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.AbstractPrincipal._Proxy
      implements calendar.Calendar {
        public fabric.lang.security.Principal
          get$jif$calendar_Calendar_servletP() {
            return ((calendar.Calendar._Impl) fetch()).
              get$jif$calendar_Calendar_servletP();
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
                     final fabric.lang.security.Principal jif$servletP) {
            super($location);
            this.jif$calendar_Calendar_servletP = jif$servletP;
        }
        
        public void jif$invokeDefConstructor() { this.calendar$Calendar$(); }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Principal jif$servletP,
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
                  equivalentTo(c.get$jif$calendar_Calendar_servletP(),
                               jif$servletP);
            }
            return false;
        }
        
        public static calendar.Calendar jif$cast$calendar_Calendar(
          final fabric.lang.security.Principal jif$servletP,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.Calendar._Impl.jif$Instanceof(jif$servletP, o))
                return (calendar.Calendar)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal
          get$jif$calendar_Calendar_servletP() {
            return this.jif$calendar_Calendar_servletP;
        }
        
        private fabric.lang.security.Principal jif$calendar_Calendar_servletP;
        
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
            $writeRef($getStore(), this.jif$calendar_Calendar_servletP,
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
            this.jif$calendar_Calendar_servletP =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.Calendar._Impl src = (calendar.Calendar._Impl) other;
            this.jif$calendar_Calendar_servletP =
              src.jif$calendar_Calendar_servletP;
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
    
    public static final byte[] $classHash = new byte[] { -94, 70, 94, 76, 91, 8,
    109, -25, -95, -91, -125, -60, 117, -99, -127, -4, -77, 80, 3, -12, -97,
    -96, 23, 56, 49, -90, -127, 35, 5, -96, 83, -53 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511920871000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

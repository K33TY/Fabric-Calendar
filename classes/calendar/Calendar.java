package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;

public interface Calendar extends fabric.lang.security.AbstractPrincipal {
    public calendar.Calendar calendar$Calendar$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511024728000L;
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
                        fabric.worker.transaction.TransactionManager $tm176 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled179 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff177 = 1;
                        boolean $doBackoff178 = true;
                        $label172: for (boolean $commit173 = false; !$commit173;
                                        ) {
                            if ($backoffEnabled179) {
                                if ($doBackoff178) {
                                    if ($backoff177 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff177);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e174) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff177 < 5000) $backoff177 *= 2;
                                }
                                $doBackoff178 = $backoff177 <= 32 ||
                                                  !$doBackoff178;
                            }
                            $commit173 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e174) {
                                $commit173 = false;
                                continue $label172;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e174) {
                                $commit173 = false;
                                fabric.common.TransactionID $currentTid175 =
                                  $tm176.getCurrentTid();
                                if ($e174.tid.isDescendantOf($currentTid175))
                                    continue $label172;
                                if ($currentTid175.parent != null) throw $e174;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e174) {
                                $commit173 = false;
                                if ($tm176.checkForStaleObjects())
                                    continue $label172;
                                throw new fabric.worker.AbortException($e174);
                            }
                            finally {
                                if ($commit173) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e174) {
                                        $commit173 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e174) {
                                        $commit173 = false;
                                        fabric.common.TransactionID
                                          $currentTid175 =
                                          $tm176.getCurrentTid();
                                        if ($currentTid175 != null) {
                                            if ($e174.tid.equals(
                                                            $currentTid175) ||
                                                  !$e174.tid.
                                                  isDescendantOf(
                                                    $currentTid175)) {
                                                throw $e174;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit173) {
                                    {  }
                                    continue $label172;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -14, -82, -101, -115,
    -72, 70, -68, -87, 16, 123, 63, 116, 70, -88, 21, -28, -89, -93, -72, 114,
    118, -4, 115, 93, -18, -106, -76, 100, 52, -73, 104, -110 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511024728000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "Lwkmnk3C/F3xN/70XX957dHpV45epoEO/uTzP/1jv9r5jc8++aHvizs//8zvf+ZnfzVc/1X0wf/7+i+r1V8xPvH/Ab6J5bfDLgAA";
}

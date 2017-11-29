package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;
import calendar.Config;

/**
*   The Calendar servlet principal that essentially has rights to any writable objects for the Calendar
*   It is has the same rights as the top principal for confidentiality
*/
public interface ServletPrincipal extends fabric.lang.security.ExternalPrincipal
{
    public fabric.principals.ServletPrincipal
      fabric$principals$ServletPrincipal$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511010373000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.ServletPrincipal {
        public fabric.principals.ServletPrincipal
          fabric$principals$ServletPrincipal$() {
            return ((fabric.principals.ServletPrincipal) fetch()).
              fabric$principals$ServletPrincipal$();
        }
        
        public static fabric.principals.ServletPrincipal getInstance() {
            return fabric.principals.ServletPrincipal._Impl.getInstance();
        }
        
        public static fabric.principals.ServletPrincipal getInstance(
          fabric.worker.Store arg1) {
            return fabric.principals.ServletPrincipal._Impl.getInstance(arg1);
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.principals.ServletPrincipal) fetch()).
              jif$invokeDefConstructor();
        }
        
        public static fabric.principals.ServletPrincipal
          jif$cast$fabric_principals_ServletPrincipal(fabric.lang.Object arg1) {
            return fabric.principals.ServletPrincipal._Impl.
              jif$cast$fabric_principals_ServletPrincipal(arg1);
        }
        
        public _Proxy(ServletPrincipal._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.ServletPrincipal {
        public fabric.principals.ServletPrincipal
          fabric$principals$ServletPrincipal$() {
            ((fabric.principals.ServletPrincipal._Impl) this.fetch()).jif$init(
                                                                        );
            { this.fabric$lang$security$ExternalPrincipal$("servlet"); }
            return (fabric.principals.ServletPrincipal) this.$getProxy();
        }
        
        public static fabric.principals.ServletPrincipal getInstance() {
            {
                fabric.worker.transaction.TransactionManager $tm103 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled106 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff104 = 1;
                boolean $doBackoff105 = true;
                $label99: for (boolean $commit100 = false; !$commit100; ) {
                    if ($backoffEnabled106) {
                        if ($doBackoff105) {
                            if ($backoff104 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff104);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e101) {
                                        
                                    }
                                }
                            }
                            if ($backoff104 < 5000) $backoff104 *= 2;
                        }
                        $doBackoff105 = $backoff104 <= 32 || !$doBackoff105;
                    }
                    $commit100 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        fabric.worker.Worker w =
                          fabric.worker.Worker.getWorker();
                        if (!fabric.lang.Object._Proxy.idEquals(w, null)) {
                            final fabric.worker.Store
                              store =
                              w.
                              getStore(
                                calendar.Config._Static._Proxy.$instance.
                                    get$calendarStoreName());
                            if (!fabric.lang.Object._Proxy.idEquals(store,
                                                                    null)) {
                                fabric.util.Map rootMap = store.getRoot();
                                if (!fabric.lang.Object._Proxy.idEquals(rootMap,
                                                                        null)) {
                                    fabric.principals.ServletPrincipal
                                      servletP = null;
                                }
                            }
                        }
                        return null;
                    }
                    catch (final fabric.worker.RetryException $e101) {
                        $commit100 = false;
                        continue $label99;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e101) {
                        $commit100 = false;
                        fabric.common.TransactionID $currentTid102 =
                          $tm103.getCurrentTid();
                        if ($e101.tid.isDescendantOf($currentTid102))
                            continue $label99;
                        if ($currentTid102.parent != null) throw $e101;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e101) {
                        $commit100 = false;
                        if ($tm103.checkForStaleObjects()) continue $label99;
                        throw new fabric.worker.AbortException($e101);
                    }
                    finally {
                        if ($commit100) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e101) {
                                $commit100 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e101) {
                                $commit100 = false;
                                fabric.common.TransactionID $currentTid102 =
                                  $tm103.getCurrentTid();
                                if ($currentTid102 != null) {
                                    if ($e101.tid.equals($currentTid102) ||
                                          !$e101.tid.isDescendantOf(
                                                       $currentTid102)) {
                                        throw $e101;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit100) {
                            {  }
                            continue $label99;
                        }
                    }
                }
            }
            return null;
        }
        
        public static fabric.principals.ServletPrincipal getInstance(
          final fabric.worker.Store store) {
            return fabric.principals.ServletPrincipal._Impl.getInstance();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.fabric$principals$ServletPrincipal$();
        }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
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
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof fabric.principals.ServletPrincipal;
        }
        
        public static fabric.principals.ServletPrincipal
          jif$cast$fabric_principals_ServletPrincipal(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.ServletPrincipal._Impl.jif$Instanceof(o))
                return (fabric.principals.ServletPrincipal)
                         fabric.lang.Object._Proxy.$getProxy(o);
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
            return (fabric.principals.ServletPrincipal) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.ServletPrincipal._Proxy(this);
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
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.ServletPrincipal._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.ServletPrincipal._Static._Impl)
                          fetch()).get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.ServletPrincipal._Static.
                            _Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.ServletPrincipal._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  ServletPrincipal.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.ServletPrincipal._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.ServletPrincipal._Static._Impl.class);
                $instance = (fabric.principals.ServletPrincipal._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.ServletPrincipal._Static {
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
                return new fabric.principals.ServletPrincipal._Static._Proxy(
                         this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm111 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled114 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff112 = 1;
                        boolean $doBackoff113 = true;
                        $label107: for (boolean $commit108 = false; !$commit108;
                                        ) {
                            if ($backoffEnabled114) {
                                if ($doBackoff113) {
                                    if ($backoff112 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff112);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e109) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff112 < 5000) $backoff112 *= 2;
                                }
                                $doBackoff113 = $backoff112 <= 32 ||
                                                  !$doBackoff113;
                            }
                            $commit108 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e109) {
                                $commit108 = false;
                                continue $label107;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e109) {
                                $commit108 = false;
                                fabric.common.TransactionID $currentTid110 =
                                  $tm111.getCurrentTid();
                                if ($e109.tid.isDescendantOf($currentTid110))
                                    continue $label107;
                                if ($currentTid110.parent != null) throw $e109;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e109) {
                                $commit108 = false;
                                if ($tm111.checkForStaleObjects())
                                    continue $label107;
                                throw new fabric.worker.AbortException($e109);
                            }
                            finally {
                                if ($commit108) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e109) {
                                        $commit108 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e109) {
                                        $commit108 = false;
                                        fabric.common.TransactionID
                                          $currentTid110 =
                                          $tm111.getCurrentTid();
                                        if ($currentTid110 != null) {
                                            if ($e109.tid.equals(
                                                            $currentTid110) ||
                                                  !$e109.tid.
                                                  isDescendantOf(
                                                    $currentTid110)) {
                                                throw $e109;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit108) {
                                    {  }
                                    continue $label107;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -56, 77, 73, 34, -39,
    -80, 25, 79, -57, 79, -80, -17, -49, 34, 32, -58, 76, 67, -110, 90, -3, -97,
    38, -1, 87, 112, -85, -81, -75, 127, 48, -94 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511010373000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "f6i8+ZNI6jEOZBXbrw9voL0XEOSDHfjqd/h96GS7U2J7uwsS/fnDsYmTNLC1k41tXLH9NHD0gW7cctDm+asnH6uPpbyBMfL5q9dfuhqGrz+Q3/SXboPWKvXlMLwHdP/Ve6R9sgo+njTe9XotqEsJx43i6jFPGpeqNp/D/dpBeeI8c8mlb72F+29ReYvKW1T+38H9yE5Ljm4FfjupgP7kIx+dnZyH8PNu/oWk8eCRQn47sj94N2T/9D2R/W/eI+2zVfAzSeOhUxar758+h9rV1KI+S3w7al+8K2r/KThfebskDifQTo4D8ToIXF3xa5GczlAC4/mP1MfTTg5VfUzx1i/VB7QOb4czdPX7SfBRohSibZw8H5y8+OKJv3PdqyeHWXlZ2o3168fZVH2+65Tda0zZeFesTkEpqqrHMW7pqvP83as7LXT4ulny8JkEdcTzhyNyh7hysnX4fP5q9c5Up4jrWdzzV194nSbds45IVzQ94oOyv4o3XlFwyGPoiWqV6VfKDMe0Ku9NOb1Rnm4WuLXt4S1k3lzbShqUn+hmXf7A8tXrR/mVIrVvqsTJedfrTsfrXpPz2he697z7yVs15aBj95h2/+I9rPjzVfDzSePR27X6bl7Zg0cDuNXET49Mv+vUtE8jqtQr35U2V59/u87wpXu041eq4ItJA6jaoSpxclwivHHmEd84L5bXXV548g7Auu/ffU8A1hGpDhpxUqNyrcRxPXzU7F7ZhVrJfR198uKbs4MDjhzIndnqmzKqdZAkgVfOB4w3SSArU24izptj6TvixXcLdq5eP8rggOQHpv8UCOE21L6T4mGC+T0DztfUUpuOjSl7vLYCXomS+sZDXEUdQbtq1/U7HKo3Oif+1Xt6Tv/4Hmn/pAr+YdJ42y0GWqPc3bDo8TuwqPHH30tYVHuxd8igcmb1tBR3fQXw2h3pV6/fxdV9o5L59XtK5qv3SPtaFfzTpPHYOYZq1zZPGo+fH0KqSyM/cJdrZMfrjyr+z/RX/5B+4R2vc4XsXXdcSD2W++XPPfbQ939O/Df1jaibVxsvM42HjNJtvPVyxS3vD4SRbth1Qy4frlocuu+fJ40n7rhzljQePvuoG/jbh9z/Kmk8cLa99rv1NkB9l+LpU+/jubv6qcO8xOHSEz67xPb6HsnTu6i6kvvaf/3+//nAQ/OvH28vNE6+wlLP/t4X3z35zckX/8vvPHvyGwz+qdWf/Pxz316En//Cl/5i8xf+D4XTsyoqPAAA";
}

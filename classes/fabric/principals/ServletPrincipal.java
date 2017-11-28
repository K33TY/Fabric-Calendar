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
      "E3Htna/FQdVrdjzAKR/LuPZgyfMFWVag8/RF4uLa194csgytFJB2XphWXArv5CMfXZxcFMtFc7wU1x45jpDfKa1H7iWtz9xXWn/rPnWfK5Ofi2uPnpJYvv/sBUmUEFDd27lTEpe/+6aQxOG09+RoXLLvO5rkVSI5RRJfv/aR6ij45DDVxyRXfqk6DD3kDufVVf7E/ygJhGjpJ9f8kw996MRLHOf6ycF7gt5OpN08ol51lnpK7g0GMO/w5YmjpChaFA1MTbGv3Xu6006Ht9s9D6+xXxVcOxxHH8oAKB5er10v80x5Y6dC22vXX3wNlu47R6hJqhZOfbBe+9c/kX9oo2uxYoL6q6DBsa5se1tOr5em2x3O8x6cG+aN8QbGoL1YM6r+B5Kv3zzKD4jUuq0SJxfh9G4wvZ8TrfDt/v7xmfOactCx+7jHX76PFX+xTH4xrj1xp1bfC2kfORrAeRM/vZ70zlPTPi0oa6/+QHguX/9O1eAr9+Hj18rky3ENKvlQpCg+hvK3zrzcrYtiec0w4Jm7AOuBf/emAKwjUh004qRC5UqJo8p9VOReTQIVUF8Vn3zojdnBAUcOw53Z6hsyKtmPY98FPl5/gwNkoOY24rwxkr4vXvygYOf6zaMMDkh+IPpPgRDuQO27RzwEjW8acL6hAG06MgNWvLKCqRTG1e3CqCw6gnbJ1827AqrXG+f++n0jp398n7p/Uib/CHySnDPQCuXuhUVP3R3G/vGbCYuqKPYuGZTBrJYCcVfX7W/cVX/95j1C3dcrma/dVzLfuE/dN8vkn8a1Jy8QVIW24CPyqYsupLyg+SP3uLJ9/FcDZfDPtC/84fjFt7/Gde133vXPH8d+v/r5Jx/94c/z/6a6fXz73wiuMLVHdRA2nr/IeC7/cBBqulUxcuVwrfGwfP88rj191/3uuPbY2UvF4O8cWv+ruPbw2TbY71Wf69W9xWdPo48X7hmnEjnAYRAJn10Yf+2I5NkkLP/95dX/9sP/6+FHl9863hSsnXydpZ///S+/a/Jbky//1999/uQ3mcGnxT/5xRe+twq++KWv/MX6L/0/Nh/IOJYzAAA=";
}

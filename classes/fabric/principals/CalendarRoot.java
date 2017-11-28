package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.worker.Store;
import fabric.util.Map;
import calendar.Config;

/**
*   The Calendar root principal that essentially has all the objects for the Calendar and is the top principal
*   It is the only principal that has integrity rights on final objects, but it doesn't use this except in
*   the possible case that something needs to be instantiated
*
*/
public interface CalendarRoot extends fabric.lang.security.ExternalPrincipal {
    public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
      final java.lang.String name);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511875772000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.CalendarRoot {
        public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
          java.lang.String arg1) {
            return ((fabric.principals.CalendarRoot) fetch()).
              fabric$principals$CalendarRoot$(arg1);
        }
        
        public static fabric.principals.CalendarRoot getInstance() {
            return fabric.principals.CalendarRoot._Impl.getInstance();
        }
        
        public static fabric.principals.CalendarRoot getInstance(
          fabric.worker.Store arg1) {
            return fabric.principals.CalendarRoot._Impl.getInstance(arg1);
        }
        
        public static fabric.principals.CalendarRoot
          jif$cast$fabric_principals_CalendarRoot(fabric.lang.Object arg1) {
            return fabric.principals.CalendarRoot._Impl.
              jif$cast$fabric_principals_CalendarRoot(arg1);
        }
        
        public _Proxy(CalendarRoot._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.CalendarRoot {
        public fabric.principals.CalendarRoot fabric$principals$CalendarRoot$(
          final java.lang.String name) {
            ((fabric.principals.CalendarRoot._Impl) this.fetch()).jif$init();
            { this.fabric$lang$security$ExternalPrincipal$(name); }
            return (fabric.principals.CalendarRoot) this.$getProxy();
        }
        
        public static fabric.principals.CalendarRoot getInstance() {
            {
                fabric.worker.transaction.TransactionManager $tm95 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled98 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff96 = 1;
                boolean $doBackoff97 = true;
                $label91: for (boolean $commit92 = false; !$commit92; ) {
                    if ($backoffEnabled98) {
                        if ($doBackoff97) {
                            if ($backoff96 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff96);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e93) {
                                        
                                    }
                                }
                            }
                            if ($backoff96 < 5000) $backoff96 *= 2;
                        }
                        $doBackoff97 = $backoff96 <= 32 || !$doBackoff97;
                    }
                    $commit92 = true;
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
                                    fabric.principals.CalendarRoot calRoot =
                                      null;
                                }
                            }
                        }
                        return null;
                    }
                    catch (final fabric.worker.RetryException $e93) {
                        $commit92 = false;
                        continue $label91;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e93) {
                        $commit92 = false;
                        fabric.common.TransactionID $currentTid94 =
                          $tm95.getCurrentTid();
                        if ($e93.tid.isDescendantOf($currentTid94))
                            continue $label91;
                        if ($currentTid94.parent != null) throw $e93;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e93) {
                        $commit92 = false;
                        if ($tm95.checkForStaleObjects()) continue $label91;
                        throw new fabric.worker.AbortException($e93);
                    }
                    finally {
                        if ($commit92) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e93) {
                                $commit92 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e93) {
                                $commit92 = false;
                                fabric.common.TransactionID $currentTid94 =
                                  $tm95.getCurrentTid();
                                if ($currentTid94 != null) {
                                    if ($e93.tid.equals($currentTid94) ||
                                          !$e93.tid.isDescendantOf(
                                                      $currentTid94)) {
                                        throw $e93;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit92) {
                            {  }
                            continue $label91;
                        }
                    }
                }
            }
            return null;
        }
        
        public static fabric.principals.CalendarRoot getInstance(
          final fabric.worker.Store store) {
            return fabric.principals.CalendarRoot._Impl.getInstance();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
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
                  $unwrap(o)) instanceof fabric.principals.CalendarRoot;
        }
        
        public static fabric.principals.CalendarRoot
          jif$cast$fabric_principals_CalendarRoot(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.CalendarRoot._Impl.jif$Instanceof(o))
                return (fabric.principals.CalendarRoot)
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
            return (fabric.principals.CalendarRoot) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.CalendarRoot._Proxy(this);
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
          implements fabric.principals.CalendarRoot._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.CalendarRoot._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.CalendarRoot._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.CalendarRoot._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  CalendarRoot.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.CalendarRoot._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.CalendarRoot._Static._Impl.class);
                $instance = (fabric.principals.CalendarRoot._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.CalendarRoot._Static {
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
                return new fabric.principals.CalendarRoot._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm103 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled106 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff104 = 1;
                        boolean $doBackoff105 = true;
                        $label99: for (boolean $commit100 = false; !$commit100;
                                       ) {
                            if ($backoffEnabled106) {
                                if ($doBackoff105) {
                                    if ($backoff104 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff104);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e101) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff104 < 5000) $backoff104 *= 2;
                                }
                                $doBackoff105 = $backoff104 <= 32 ||
                                                  !$doBackoff105;
                            }
                            $commit100 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
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
                                if ($tm103.checkForStaleObjects())
                                    continue $label99;
                                throw new fabric.worker.AbortException($e101);
                            }
                            finally {
                                if ($commit100) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e101) {
                                        $commit100 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e101) {
                                        $commit100 = false;
                                        fabric.common.TransactionID
                                          $currentTid102 =
                                          $tm103.getCurrentTid();
                                        if ($currentTid102 != null) {
                                            if ($e101.tid.equals(
                                                            $currentTid102) ||
                                                  !$e101.tid.
                                                  isDescendantOf(
                                                    $currentTid102)) {
                                                throw $e101;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit100) {
                                    {  }
                                    continue $label99;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 20, -76, 85, 71, -86,
    -97, -16, 34, -101, -75, -128, 59, 37, -102, -22, 91, -111, 93, -107, 116,
    -28, -110, 100, 117, -46, -94, 17, 109, 18, 99, -95, 38 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511875772000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "cuueG/sXtx19uLnT9Zt3LR6OrTSLg8VNexcnN+bqwXoOfqT6P9lqXaZPry9cmKsLr/lvmeZLrdON9brLGYn33TrN57tJl44baY3yGqrbu2w3NccerErYo8avnG8wX7m4wXzlnLvVDcYeq6kA1f9dFUOfOb0GbyDTbTs25/smxc2iPnpKyT+9fvSNRb0oSXqXurxOgrT1trWVnunvrhJ9qNW6b3V6HX5XJKopUafX/psq72yL6O0371aJ9WbynXeJGs4+fpc5+Et1Urz5HDSWeoP1s2t677dv3+M+eeF3P/PFemv7LVWdbszdsLjvU/k+le9T+f+Hyls/smWcloGc7gTNaRcUexGCPoh0r77J70Mnu0xPnF0WptYLFZd5xdFJHjrmydaxrziBk75w9eRjJy99RDx55WoU3Q3uL6WtB04pnMN962ytvgk869pPR9FdwPnVu9T9RJ18Mm09eMZi02p2uldeXxZp695aiFuQvF52Ws/chuSXv3UnpfwJOKx0s3aOxzlOjoeBTlZh6Fl60KjpbPUK7Rdeas56nByH+pjur15pTjscc8cDKU3+JPzIsFKsY5+8EJ58+MMnQeZ5V0+OIVvV20us66crbXNY4ozda2wlvCfVRwp0w7CShNhYhvvCnYc763S8u9HzeJuGTcELx/Mmx7JqIT7evnC1zrP1kbxmhX/h6otvINJdx4gt3bRiIazm6/CdDxQe29hWamyq+itVg9O6uu0NPX2nPN3ocFH26AKZtyZbRWMcpNa66X9k+er1U/1VKnVumMTJxbD16vU38+KLQVvjUXePx568aCVH+7pLOPbTd/Hqn6uTz6WtR2+26Dv59gOnxn/Rvc/OHr7rzK3PCuraK98Vmevbn2ka/Pxd5PiFOvk7aetHajkMPUlPnx1fPn+SePmiSu4Ucjanhp+8Daju+fffE0B1ilBHazhpELox3qRZShp2r2SRWXHfFJ98+K3Z/xE/juTOffQtOdMqTNPQJ8LAfosE9lXNDaR5ayy9KU58t+Dm6vVTHRwR/Mj0nwAl3ITWt1NsSr53QPmaUVnTqTDVjDdeIOhx2hwbTuqiU7Cu5bp+W3B18xuP5nf/naKof3DXKOord6n7pTr5cvX4e8FBG4S7ExY9fhsWtb7xvYRFTUR7mw7qwNbKK3U3385cu63+6vU7hL3fqWZ++a6a+Sd3qfundfKP09ZjtzBUF3+2qBbWi8tHfer6h+7wDcbpN0MG8avWF3+fefEdb/D9xbtu+4rrtN8vfuGxB3/wC9K/aT4puPE90ENs60G7ChUvnk6+kL8/ii3baYR46HhW+Th1v5a2nrjtg4209fD5TSPcrx5bfy1t3X/+vvVfNK+FmsPIT59FHc/fMTaligqDq+j3hlXcJRJ5Oovr79he/68/+D/vf3Dx9dPjv62Tp/6RRH/pb/7Rcz/9lU9c/+G/8Z9f+qsf+Vz6e581s9/+W0/4Txo/9/z/BUqr9L5fNwAA";
}

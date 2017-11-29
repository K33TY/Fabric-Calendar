package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;

public interface ViewerEvent extends fabric.lang.Object {
    public calendar.event.ViewerEvent calendar$event$ViewerEvent$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511009306000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$ViewerEvent$_split_0
      extends fabric.lang.Object {
        public long get$onum();
        
        public long set$onum(long val);
        
        public long postInc$onum();
        
        public long postDec$onum();
        
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.ViewerEvent get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$ViewerEvent$_split_0 {
            public long get$onum() {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  get$onum();
            }
            
            public long set$onum(long val) {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  set$onum(val);
            }
            
            public long postInc$onum() {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  postInc$onum();
            }
            
            public long postDec$onum() {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  postDec$onum();
            }
            
            public java.lang.String get$name() {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  set$name(val);
            }
            
            public calendar.event.ViewerEvent get$$root() {
                return ((calendar.event.ViewerEvent.
                          calendar$event$ViewerEvent$_split_0._Impl) fetch()).
                  get$$root();
            }
            
            public _Proxy(calendar$event$ViewerEvent$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$ViewerEvent$_split_0 {
            public long get$onum() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.onum;
            }
            
            public long set$onum(long val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.onum = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public long postInc$onum() {
                long tmp = this.get$onum();
                this.set$onum((long) (tmp + 1));
                return tmp;
            }
            
            public long postDec$onum() {
                long tmp = this.get$onum();
                this.set$onum((long) (tmp - 1));
                return tmp;
            }
            
            long onum;
            
            public java.lang.String get$name() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.name;
            }
            
            public java.lang.String set$name(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.name = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String name;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       fabric.lang.security.LabelUtil._Impl.noComponents());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$ViewerEvent$_split_0) this.$getProxy();
            }
            
            public calendar.event.ViewerEvent get$$root() { return this.$root; }
            
            private calendar.event.ViewerEvent $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.ViewerEvent root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.ViewerEvent.
                         calendar$event$ViewerEvent$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                out.writeLong(this.onum);
                $writeInline(out, this.name);
                $writeRef($getStore(), this.$root, refTypes, out,
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
                this.onum = in.readLong();
                this.name = (java.lang.String) in.readObject();
                this.$root = (calendar.event.ViewerEvent)
                               $readRef(calendar.event.ViewerEvent._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.
                  event.
                  ViewerEvent.
                  calendar$event$ViewerEvent$_split_0.
                  _Impl
                  src =
                  (calendar.event.ViewerEvent.
                    calendar$event$ViewerEvent$_split_0._Impl) other;
                this.onum = src.onum;
                this.name = src.name;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.ViewerEvent.
                           calendar$event$ViewerEvent$_split_0._Static
            {
                public _Proxy(calendar.event.ViewerEvent.
                                calendar$event$ViewerEvent$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.ViewerEvent.
                  calendar$event$ViewerEvent$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      ViewerEvent.
                      calendar$event$ViewerEvent$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        ViewerEvent.
                        calendar$event$ViewerEvent$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.ViewerEvent.
                            calendar$event$ViewerEvent$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (calendar.event.ViewerEvent.
                        calendar$event$ViewerEvent$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.ViewerEvent.
                           calendar$event$ViewerEvent$_split_0._Static
            {
                public void $serialize(java.io.ObjectOutput out,
                                       java.util.List refTypes,
                                       java.util.List intraStoreRefs,
                                       java.util.List interStoreRefs)
                      throws java.io.IOException {
                    super.$serialize(out, refTypes, intraStoreRefs,
                                     interStoreRefs);
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
                
                public _Impl(fabric.worker.Store store) { super(store); }
                
                protected fabric.lang.Object._Proxy $makeProxy() {
                    return new calendar.event.ViewerEvent.
                             calendar$event$ViewerEvent$_split_0._Static._Proxy(
                             this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { -92, -66, 94, 6,
        -33, 51, 118, 118, 23, -127, 81, 127, -94, -33, -34, -104, 34, 87, 98,
        -82, 98, -99, 64, -123, -88, -10, 58, -25, -82, 79, -104, 2 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511009306000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
      get$calendar$event$ViewerEvent$_split_0();
    
    public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
      set$calendar$event$ViewerEvent$_split_0(
      calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0 val);
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.ViewerEvent {
        public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
          get$calendar$event$ViewerEvent$_split_0() {
            return ((calendar.event.ViewerEvent._Impl) fetch()).
              get$calendar$event$ViewerEvent$_split_0();
        }
        
        public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
          set$calendar$event$ViewerEvent$_split_0(
          calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0 val) {
            return ((calendar.event.ViewerEvent._Impl) fetch()).
              set$calendar$event$ViewerEvent$_split_0(val);
        }
        
        public calendar.event.ViewerEvent calendar$event$ViewerEvent$() {
            return ((calendar.event.ViewerEvent) fetch()).
              calendar$event$ViewerEvent$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.event.ViewerEvent) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.event.ViewerEvent._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.event.ViewerEvent
          jif$cast$calendar_event_ViewerEvent(fabric.lang.Object arg1) {
            return calendar.event.ViewerEvent._Impl.
              jif$cast$calendar_event_ViewerEvent(arg1);
        }
        
        public _Proxy(ViewerEvent._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public abstract static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.ViewerEvent {
        public calendar.event.ViewerEvent calendar$event$ViewerEvent$() {
            ((calendar.event.ViewerEvent._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.event.ViewerEvent) this.$getProxy();
        }
        
        public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
          get$calendar$event$ViewerEvent$_split_0() {
            return this.calendar$event$ViewerEvent$_split_0;
        }
        
        public calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0
          set$calendar$event$ViewerEvent$_split_0(
          calendar.event.ViewerEvent.calendar$event$ViewerEvent$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$ViewerEvent$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$ViewerEvent$_split_0
          calendar$event$ViewerEvent$_split_0;
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.calendar$event$ViewerEvent$();
        }
        
        private void jif$init() {
            this.
              set$calendar$event$ViewerEvent$_split_0(
                (calendar$event$ViewerEvent$_split_0)
                  new calendar.event.ViewerEvent.
                    calendar$event$ViewerEvent$_split_0._Impl(
                    this.$getStore(),
                    (calendar.event.ViewerEvent) this.$getProxy()).
                  $getProxy());
            this.get$calendar$event$ViewerEvent$_split_0().set$name("busy");
        }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof calendar.event.ViewerEvent;
        }
        
        public static calendar.event.ViewerEvent
          jif$cast$calendar_event_ViewerEvent(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.ViewerEvent._Impl.jif$Instanceof(o))
                return (calendar.event.ViewerEvent)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   fabric.lang.security.LabelUtil._Impl.noComponents());
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.event.ViewerEvent) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$ViewerEvent$_split_0().fabric$lang$Object$(
                                                             );
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.ViewerEvent._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$ViewerEvent$_split_0,
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
            this.calendar$event$ViewerEvent$_split_0 =
              (calendar.
                event.
                ViewerEvent.
                calendar$event$ViewerEvent$_split_0)
                $readRef(
                  calendar.event.ViewerEvent.
                    calendar$event$ViewerEvent$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.ViewerEvent._Impl src =
              (calendar.event.ViewerEvent._Impl) other;
            this.calendar$event$ViewerEvent$_split_0 =
              src.calendar$event$ViewerEvent$_split_0;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.ViewerEvent._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.ViewerEvent._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.ViewerEvent._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.ViewerEvent._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.ViewerEvent._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.event.ViewerEvent._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.ViewerEvent._Static $instance;
            
            static {
                calendar.
                  event.
                  ViewerEvent.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.ViewerEvent._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.ViewerEvent._Static._Impl.class);
                $instance = (calendar.event.ViewerEvent._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.ViewerEvent._Static {
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
                return new calendar.event.ViewerEvent._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm71 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled74 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff72 = 1;
                        boolean $doBackoff73 = true;
                        $label67: for (boolean $commit68 = false; !$commit68;
                                       ) {
                            if ($backoffEnabled74) {
                                if ($doBackoff73) {
                                    if ($backoff72 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff72);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e69) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff72 < 5000) $backoff72 *= 2;
                                }
                                $doBackoff73 = $backoff72 <= 32 ||
                                                 !$doBackoff73;
                            }
                            $commit68 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e69) {
                                $commit68 = false;
                                continue $label67;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e69) {
                                $commit68 = false;
                                fabric.common.TransactionID $currentTid70 =
                                  $tm71.getCurrentTid();
                                if ($e69.tid.isDescendantOf($currentTid70))
                                    continue $label67;
                                if ($currentTid70.parent != null) throw $e69;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e69) {
                                $commit68 = false;
                                if ($tm71.checkForStaleObjects())
                                    continue $label67;
                                throw new fabric.worker.AbortException($e69);
                            }
                            finally {
                                if ($commit68) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e69) {
                                        $commit68 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e69) {
                                        $commit68 = false;
                                        fabric.common.TransactionID
                                          $currentTid70 = $tm71.getCurrentTid();
                                        if ($currentTid70 != null) {
                                            if ($e69.tid.equals(
                                                           $currentTid70) ||
                                                  !$e69.tid.isDescendantOf(
                                                              $currentTid70)) {
                                                throw $e69;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit68) {
                                    {  }
                                    continue $label67;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -92, -66, 94, 6, -33,
    51, 118, 118, 23, -127, 81, 127, -94, -33, -34, -104, 34, 87, 98, -82, 98,
    -99, 64, -123, -88, -10, 58, -25, -82, 79, -104, 2 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511009306000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

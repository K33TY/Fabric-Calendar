package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;

public interface OwnerEvent extends fabric.lang.Object {
    public calendar.event.OwnerEvent calendar$event$OwnerEvent$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511914328000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$OwnerEvent$_split_0
      extends fabric.lang.Object {
        public fabric.lang.security.Label get$lbl();
        
        public fabric.lang.security.Label set$lbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.OwnerEvent get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$OwnerEvent$_split_0 {
            public fabric.lang.security.Label get$lbl() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$lbl();
            }
            
            public fabric.lang.security.Label set$lbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  set$lbl(val);
            }
            
            public calendar.event.OwnerEvent get$$root() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$$root();
            }
            
            public _Proxy(calendar$event$OwnerEvent$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$OwnerEvent$_split_0 {
            public fabric.lang.security.Label get$lbl() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.lbl;
            }
            
            public fabric.lang.security.Label set$lbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.lbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label lbl;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       fabric.lang.security.LabelUtil._Impl.noComponents());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$OwnerEvent$_split_0) this.$getProxy();
            }
            
            public calendar.event.OwnerEvent get$$root() { return this.$root; }
            
            private calendar.event.OwnerEvent $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.OwnerEvent root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.OwnerEvent.
                         calendar$event$OwnerEvent$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.lbl, refTypes, out, intraStoreRefs,
                          interStoreRefs);
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
                this.lbl = (fabric.lang.security.Label)
                             $readRef(fabric.lang.security.Label._Proxy.class,
                                      (fabric.common.RefTypeEnum)
                                        refTypes.next(), in, store,
                                      intraStoreRefs, interStoreRefs);
                this.$root = (calendar.event.OwnerEvent)
                               $readRef(calendar.event.OwnerEvent._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.
                  event.
                  OwnerEvent.
                  calendar$event$OwnerEvent$_split_0.
                  _Impl
                  src =
                  (calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0.
                    _Impl) other;
                this.lbl = src.lbl;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.OwnerEvent.
                           calendar$event$OwnerEvent$_split_0._Static
            {
                public _Proxy(calendar.event.OwnerEvent.
                                calendar$event$OwnerEvent$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.OwnerEvent.
                  calendar$event$OwnerEvent$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      OwnerEvent.
                      calendar$event$OwnerEvent$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        OwnerEvent.
                        calendar$event$OwnerEvent$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.OwnerEvent.
                            calendar$event$OwnerEvent$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (calendar.event.OwnerEvent.
                        calendar$event$OwnerEvent$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.OwnerEvent.
                           calendar$event$OwnerEvent$_split_0._Static
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
                    return new calendar.event.OwnerEvent.
                             calendar$event$OwnerEvent$_split_0._Static._Proxy(
                             this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { -38, 82, 39, -87,
        28, -6, -89, -35, 16, 125, 118, 66, -116, -84, -55, 74, -46, -19, 29,
        -21, -41, 92, 21, 105, -72, 97, -95, -101, 58, 35, 103, 40 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511914328000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
      get$calendar$event$OwnerEvent$_split_0();
    
    public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
      set$calendar$event$OwnerEvent$_split_0(
      calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val);
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.OwnerEvent {
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          get$calendar$event$OwnerEvent$_split_0() {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              get$calendar$event$OwnerEvent$_split_0();
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          set$calendar$event$OwnerEvent$_split_0(
          calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val) {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              set$calendar$event$OwnerEvent$_split_0(val);
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L(
          ) {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              get$jif$calendar_event_OwnerEvent_L();
        }
        
        public calendar.event.OwnerEvent calendar$event$OwnerEvent$() {
            return ((calendar.event.OwnerEvent) fetch()).
              calendar$event$OwnerEvent$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.event.OwnerEvent) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return calendar.event.OwnerEvent._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static calendar.event.OwnerEvent
          jif$cast$calendar_event_OwnerEvent(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return calendar.event.OwnerEvent._Impl.
              jif$cast$calendar_event_OwnerEvent(arg1, arg2);
        }
        
        public _Proxy(OwnerEvent._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.OwnerEvent {
        public calendar.event.OwnerEvent calendar$event$OwnerEvent$() {
            ((calendar.event.OwnerEvent._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.event.OwnerEvent) this.$getProxy();
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          get$calendar$event$OwnerEvent$_split_0() {
            return this.calendar$event$OwnerEvent$_split_0;
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          set$calendar$event$OwnerEvent$_split_0(
          calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$OwnerEvent$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$OwnerEvent$_split_0
          calendar$event$OwnerEvent$_split_0;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$calendar_event_OwnerEvent_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() {
            this.calendar$event$OwnerEvent$();
        }
        
        private void jif$init() {
            this.
              set$calendar$event$OwnerEvent$_split_0(
                (calendar$event$OwnerEvent$_split_0)
                  new calendar.event.OwnerEvent.
                    calendar$event$OwnerEvent$_split_0._Impl(
                    this.$getStore(),
                    (calendar.event.OwnerEvent) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof calendar.event.OwnerEvent) {
                calendar.event.OwnerEvent c =
                  (calendar.event.OwnerEvent)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$calendar_event_OwnerEvent_L(), jif$L);
            }
            return false;
        }
        
        public static calendar.event.OwnerEvent
          jif$cast$calendar_event_OwnerEvent(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.OwnerEvent._Impl.jif$Instanceof(jif$L, o))
                return (calendar.event.OwnerEvent)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L(
          ) {
            return this.jif$calendar_event_OwnerEvent_L;
        }
        
        private fabric.lang.security.Label jif$calendar_event_OwnerEvent_L;
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   fabric.lang.security.LabelUtil._Impl.noComponents());
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.event.OwnerEvent) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$OwnerEvent$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.OwnerEvent._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$OwnerEvent$_split_0,
                      refTypes, out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_OwnerEvent_L,
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
            this.calendar$event$OwnerEvent$_split_0 =
              (calendar.
                event.
                OwnerEvent.
                calendar$event$OwnerEvent$_split_0)
                $readRef(
                  calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_OwnerEvent_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.OwnerEvent._Impl src =
              (calendar.event.OwnerEvent._Impl) other;
            this.calendar$event$OwnerEvent$_split_0 =
              src.calendar$event$OwnerEvent$_split_0;
            this.jif$calendar_event_OwnerEvent_L =
              src.jif$calendar_event_OwnerEvent_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.OwnerEvent._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.event.OwnerEvent._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.OwnerEvent._Static $instance;
            
            static {
                calendar.
                  event.
                  OwnerEvent.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.OwnerEvent._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.OwnerEvent._Static._Impl.class);
                $instance = (calendar.event.OwnerEvent._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.OwnerEvent._Static {
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
                return new calendar.event.OwnerEvent._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm20 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled23 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff21 = 1;
                        boolean $doBackoff22 = true;
                        $label16: for (boolean $commit17 = false; !$commit17;
                                       ) {
                            if ($backoffEnabled23) {
                                if ($doBackoff22) {
                                    if ($backoff21 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff21);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e18) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff21 < 5000) $backoff21 *= 2;
                                }
                                $doBackoff22 = $backoff21 <= 32 ||
                                                 !$doBackoff22;
                            }
                            $commit17 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e18) {
                                $commit17 = false;
                                continue $label16;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e18) {
                                $commit17 = false;
                                fabric.common.TransactionID $currentTid19 =
                                  $tm20.getCurrentTid();
                                if ($e18.tid.isDescendantOf($currentTid19))
                                    continue $label16;
                                if ($currentTid19.parent != null) throw $e18;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e18) {
                                $commit17 = false;
                                if ($tm20.checkForStaleObjects())
                                    continue $label16;
                                throw new fabric.worker.AbortException($e18);
                            }
                            finally {
                                if ($commit17) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e18) {
                                        $commit17 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e18) {
                                        $commit17 = false;
                                        fabric.common.TransactionID
                                          $currentTid19 = $tm20.getCurrentTid();
                                        if ($currentTid19 != null) {
                                            if ($e18.tid.equals(
                                                           $currentTid19) ||
                                                  !$e18.tid.isDescendantOf(
                                                              $currentTid19)) {
                                                throw $e18;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit17) {
                                    {  }
                                    continue $label16;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -38, 82, 39, -87, 28,
    -6, -89, -35, 16, 125, 118, 66, -116, -84, -55, 74, -46, -19, 29, -21, -41,
    92, 21, 105, -72, 97, -95, -101, 58, 35, 103, 40 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511914328000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}

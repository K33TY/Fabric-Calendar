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
    public static final long jlc$SourceLastModified$fabric = 1511010099000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$OwnerEvent$_split_0
      extends fabric.lang.Object {
        public long get$onum();
        
        public long set$onum(long val);
        
        public long postInc$onum();
        
        public long postDec$onum();
        
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public java.lang.String get$note();
        
        public java.lang.String set$note(java.lang.String val);
        
        public fabric.lang.security.Label get$lbl();
        
        public fabric.lang.security.Label set$lbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.OwnerEvent get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$OwnerEvent$_split_0 {
            public long get$onum() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$onum();
            }
            
            public long set$onum(long val) {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  set$onum(val);
            }
            
            public long postInc$onum() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  postInc$onum();
            }
            
            public long postDec$onum() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  postDec$onum();
            }
            
            public java.lang.String get$name() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  set$name(val);
            }
            
            public java.lang.String get$note() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$note();
            }
            
            public java.lang.String set$note(java.lang.String val) {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  set$note(val);
            }
            
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
            
            public java.lang.String get$note() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.note;
            }
            
            public java.lang.String set$note(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.note = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String note;
            
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
                out.writeLong(this.onum);
                $writeInline(out, this.name);
                $writeInline(out, this.note);
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
                this.onum = in.readLong();
                this.name = (java.lang.String) in.readObject();
                this.note = (java.lang.String) in.readObject();
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
                this.onum = src.onum;
                this.name = src.name;
                this.note = src.note;
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
        
        public static final byte[] $classHash = new byte[] { 98, -124, 20, 39,
        -113, 90, -14, -46, 67, 54, 106, -33, 105, 49, 86, -86, 53, 71, 20, 99,
        73, -95, -25, -112, -39, -25, 74, 36, -96, -98, -103, -71 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511010099000L;
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
                        fabric.worker.transaction.TransactionManager $tm55 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled58 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff56 = 1;
                        boolean $doBackoff57 = true;
                        $label51: for (boolean $commit52 = false; !$commit52;
                                       ) {
                            if ($backoffEnabled58) {
                                if ($doBackoff57) {
                                    if ($backoff56 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff56);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e53) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff56 < 5000) $backoff56 *= 2;
                                }
                                $doBackoff57 = $backoff56 <= 32 ||
                                                 !$doBackoff57;
                            }
                            $commit52 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e53) {
                                $commit52 = false;
                                continue $label51;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e53) {
                                $commit52 = false;
                                fabric.common.TransactionID $currentTid54 =
                                  $tm55.getCurrentTid();
                                if ($e53.tid.isDescendantOf($currentTid54))
                                    continue $label51;
                                if ($currentTid54.parent != null) throw $e53;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e53) {
                                $commit52 = false;
                                if ($tm55.checkForStaleObjects())
                                    continue $label51;
                                throw new fabric.worker.AbortException($e53);
                            }
                            finally {
                                if ($commit52) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e53) {
                                        $commit52 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e53) {
                                        $commit52 = false;
                                        fabric.common.TransactionID
                                          $currentTid54 = $tm55.getCurrentTid();
                                        if ($currentTid54 != null) {
                                            if ($e53.tid.equals(
                                                           $currentTid54) ||
                                                  !$e53.tid.isDescendantOf(
                                                              $currentTid54)) {
                                                throw $e53;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit52) {
                                    {  }
                                    continue $label51;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 98, -124, 20, 39, -113,
    90, -14, -46, 67, 54, 106, -33, 105, 49, 86, -86, 53, 71, 20, 99, 73, -95,
    -25, -112, -39, -25, 74, 36, -96, -98, -103, -71 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511010099000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "/v4D6v5hmfy9uPaeM2KuYHovVD11EVWtdxuqqj3HBT3c2XpUV1uPLtTfuHXz4P9ma3K0R85hCZrDPZAPr9979/FOdfxPH6jjbzyg7p+VyT+Oa0+em1a15cji2mOnsyjvWf3gPS5cHl8LVvB/rr35++Ob77vPZcsPXriofdzua288+egH3uD+fXWJ8M6V32tU7VG9WIjPXis6k78ShJpuVlO4tr9ktBfcbxaO/u4/1nHtkepdTek39lT/sthcnVCV39+s/n09dyfZO+LnkrC8ZP7Wf//An1x5lP328Y2b2sHqJ5/98z8r/bffxbvWt8wm/9XO4FmF/Fvf/bnf++7o8G++8eV/9H8AskFixvwuAAA=";
}

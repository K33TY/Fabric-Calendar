package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;
import fabricated.util.List;
import calendar.util.Date;

public interface Event extends fabric.lang.Object {
    public calendar.event.Event calendar$event$Event$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511977694000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$Event$_split_0
      extends fabric.lang.Object {
        public long get$onum();
        
        public long set$onum(long val);
        
        public long postInc$onum();
        
        public long postDec$onum();
        
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public calendar.util.Date get$startTime();
        
        public calendar.util.Date set$startTime(calendar.util.Date val);
        
        public calendar.util.Date get$endTime();
        
        public calendar.util.Date set$endTime(calendar.util.Date val);
        
        public java.lang.String get$note();
        
        public java.lang.String set$note(java.lang.String val);
        
        public fabric.lang.security.Label get$lbl();
        
        public fabric.lang.security.Label set$lbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_0 {
            public long get$onum() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$onum();
            }
            
            public long set$onum(long val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$onum(val);
            }
            
            public long postInc$onum() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postInc$onum();
            }
            
            public long postDec$onum() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postDec$onum();
            }
            
            public java.lang.String get$name() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$name(val);
            }
            
            public calendar.util.Date get$startTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$startTime();
            }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$startTime(val);
            }
            
            public calendar.util.Date get$endTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$endTime();
            }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$endTime(val);
            }
            
            public java.lang.String get$note() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$note();
            }
            
            public java.lang.String set$note(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$note(val);
            }
            
            public fabric.lang.security.Label get$lbl() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$lbl();
            }
            
            public fabric.lang.security.Label set$lbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$lbl(val);
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_0 {
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
            
            public calendar.util.Date get$startTime() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.startTime;
            }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.startTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date startTime;
            
            public calendar.util.Date get$endTime() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.endTime;
            }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.endTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date endTime;
            
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
                return (calendar$event$Event$_split_0) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_0.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                out.writeLong(this.onum);
                $writeInline(out, this.name);
                $writeRef($getStore(), this.startTime, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.endTime, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.startTime = (calendar.util.Date)
                                   $readRef(calendar.util.Date._Proxy.class,
                                            (fabric.common.RefTypeEnum)
                                              refTypes.next(), in, store,
                                            intraStoreRefs, interStoreRefs);
                this.endTime = (calendar.util.Date)
                                 $readRef(calendar.util.Date._Proxy.class,
                                          (fabric.common.RefTypeEnum)
                                            refTypes.next(), in, store,
                                          intraStoreRefs, interStoreRefs);
                this.note = (java.lang.String) in.readObject();
                this.lbl = (fabric.lang.security.Label)
                             $readRef(fabric.lang.security.Label._Proxy.class,
                                      (fabric.common.RefTypeEnum)
                                        refTypes.next(), in, store,
                                      intraStoreRefs, interStoreRefs);
                this.$root = (calendar.event.Event)
                               $readRef(calendar.event.Event._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.event.Event.calendar$event$Event$_split_0._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_0._Impl)
                    other;
                this.onum = src.onum;
                this.name = src.name;
                this.startTime = src.startTime;
                this.endTime = src.endTime;
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
              implements calendar.event.Event.calendar$event$Event$_split_0.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_0.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_0.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_0.
                           _Static
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
                    return new calendar.event.Event.
                             calendar$event$Event$_split_0._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 60, 30, 70, -123,
        -93, -100, 46, -73, 0, 20, 11, 81, 0, -47, -10, 42, -70, -115, 24, 24,
        -120, -65, -115, -83, 24, 3, -77, 48, 74, 79, -80, 72 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511977694000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_0
      get$calendar$event$Event$_split_0();
    
    public calendar.event.Event.calendar$event$Event$_split_0
      set$calendar$event$Event$_split_0(
      calendar.event.Event.calendar$event$Event$_split_0 val);
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.Event {
        public calendar.event.Event.calendar$event$Event$_split_0
          get$calendar$event$Event$_split_0() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_0();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          set$calendar$event$Event$_split_0(
          calendar.event.Event.calendar$event$Event$_split_0 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_0(val);
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_L();
        }
        
        public calendar.event.Event calendar$event$Event$() {
            return ((calendar.event.Event) fetch()).calendar$event$Event$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.event.Event) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return calendar.event.Event._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          fabric.lang.security.Label arg1, fabric.lang.Object arg2) {
            return calendar.event.Event._Impl.jif$cast$calendar_event_Event(
                                                arg1, arg2);
        }
        
        public _Proxy(Event._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.Event {
        public calendar.event.Event calendar$event$Event$() {
            ((calendar.event.Event._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.event.Event) this.$getProxy();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          get$calendar$event$Event$_split_0() {
            return this.calendar$event$Event$_split_0;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          set$calendar$event$Event$_split_0(
          calendar.event.Event.calendar$event$Event$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_0 calendar$event$Event$_split_0;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$calendar_event_Event_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() { this.calendar$event$Event$(); }
        
        private void jif$init() {
            this.
              set$calendar$event$Event$_split_0(
                (calendar$event$Event$_split_0)
                  new calendar.event.Event.calendar$event$Event$_split_0._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
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
                      $unwrap(o)) instanceof calendar.event.Event) {
                calendar.event.Event c =
                  (calendar.event.Event) fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$calendar_event_Event_L(), jif$L);
            }
            return false;
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.Event._Impl.jif$Instanceof(jif$L, o))
                return (calendar.event.Event)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return this.jif$calendar_event_Event_L;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_L;
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   fabric.lang.security.LabelUtil._Impl.noComponents());
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.event.Event) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$Event$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.Event._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$Event$_split_0, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_L, refTypes,
                      out, intraStoreRefs, interStoreRefs);
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
            this.calendar$event$Event$_split_0 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_0)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_0.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.Event._Impl src = (calendar.event.Event._Impl) other;
            this.calendar$event$Event$_split_0 =
              src.calendar$event$Event$_split_0;
            this.jif$calendar_event_Event_L = src.jif$calendar_event_Event_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.Event._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.event.Event._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.Event._Static $instance;
            
            static {
                calendar.
                  event.
                  Event.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.Event._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.Event._Static._Impl.class);
                $instance = (calendar.event.Event._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.Event._Static {
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
                return new calendar.event.Event._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { 60, 30, 70, -123, -93,
    -100, 46, -73, 0, 20, 11, 81, 0, -47, -10, 42, -70, -115, 24, 24, -120, -65,
    -115, -83, 24, 3, -77, 48, 74, 79, -80, 72 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511977694000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "m4Hnoa0dlTi2gzx09Z5u3Hbefu360aeq0+l7zsu16zfeLG38bH7uh/I7JqnM/XQUXaCOv3FB3mfK4MfS2vP3k7mqNTs56Ckfy7T2YDnKcxosUVRF7tTgpaP3jwYPlHS7Cu20VNnRG3queNcu5MFPKf76zaOPHwX69mIarwpeOz4+vn79xieko/MaP8+Vl8qoW9yJgSv3wsDnL8TAFy/Ie7sMPpfWHjkddPn+1jn9PlkWf/Eu/V7+5PtGv4fz5qMTQ12HoacrQaXoUyINjWtvVIfRRwd/pNJVdRx7iJ1eGDi8VbcGDnovG+FfPbqo7uG0/VA8/AQNYGUbR9fCo48DzGSed/3owNqgtpfoN+5/TWFWnpcqqqonCWnpqnvtPYta1jy8BmGpiTAorzBdu/7qUVglX79xkMi+NRtHFXRLC6giRyoA+LVDWnjjTOALRdU3GTAroKJ0Gl5Tj++/xL9aTSLgwDsm4s+yj8tnx/knN1fuxPnls1KtUzfnmdtFPujlgssfX7nAcv52GXw5rT15J4ruxZlXTgB3u1md3mR6/tScThPK3Kt/fgMvg69Wpd69YDBfL4OfL68UVDpK0nsq6r6r9zN3c//PvW+44YQUDmA4qkjwcCmo4v9qzb6aRRoQq0oGdvD/bHY3Tpo92PIoBP3v/jzaPVbDwDg0V3ZSjWWkxGl1k6zq98TAyu5v3LUAvVeX41cuXG7+wQV5/7AMfjmtPX7bNFcIvReqnr4bVcfvN1RVDsVderjlV1SXpo/vyr9+49Wj9+h3HB9Ac7XEy9UDhq9eu7d/8V7V+48vVO83L8j7p2XwG2ntqXMjqpyKIq09VA2gvMb3g/e4yntyzVwl/5n+zh9yrz53n2u8z9918f+k3te/9tQj3/+12b+t7qjeukL+KF97xACr7O231m6LPxzFumFX0j96uMN2mLPfAsx+5ycxEL96VqP5zUOpfwE8p9NS5fu3qs+oF24FB+Z9IYvL/7Tw7n/7/v/58CPTb59c6Kod/fBL9E/8na8c/3rt2cfHtd/7k4/9xueff/6tf/L5X3z+gV9tDMRf7v9fVt569UwxAAA=";
}

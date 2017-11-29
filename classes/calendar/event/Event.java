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
    public static final long jlc$SourceLastModified$fabric = 1511916329000L;
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
        
        public static final byte[] $classHash = new byte[] { 26, -76, 1, -7,
        -41, -128, 107, -34, -101, -40, 104, -122, 122, 102, 82, -116, -122, 33,
        75, -53, -68, 3, -24, 55, -39, 86, 15, -117, -71, 125, -128, 9 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511916329000L;
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
    
    public static final byte[] $classHash = new byte[] { 26, -76, 1, -7, -41,
    -128, 107, -34, -101, -40, 104, -122, 122, 102, 82, -116, -122, 33, 75, -53,
    -68, 3, -24, 55, -39, 86, 15, -117, -71, 125, -128, 9 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511916329000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "np7eunX7k8LJRTlf9AtX6kenfFDy1x4l+Z+8VPJ/85K2n66Ln8haT50vuv7/uQtSfaYmf/EhqV75/e8h1WOu8OQMlGoYeoYSNOI9N9XQvPlKk0g8OcaZRkJNKu34dJ7sPf5rMr5HadeD0C+fXNb3mCk9koefHFfKtM2Tm+HJJypN5Z536+ToF6reXmrcfvMU87LOdSmaZqQpsTU09+ZbZrXuefwbhLWowqC++XHz1ssnYVN96/aRI/uuNE4awNS4ax5OtApWN4914e17DF/KqhHnFZgrGGZieFM7ffMg8nIjxMreHxDE90Ll1Xup2LNbBw+i6+o9KuQ8kD5/P8tHvVySuP/5S/D6S3Xxpaz1zIMoepR/uHYGuPvBfH4B5L3nID6vqFtv/MUtvC5+oaH6lUsW86t18XfqdHCjozR7pKLeND48/7BFvu+txYejCk4agz9eo2h8XRMVbuSRXvVrqiv0/T+D/fbZsEcL4sJq/v1fxLinWhiYx+HqSZq1cEqSNXdvmnnPYF1Pf/shZ/tWg9o/uNS1fu2Stl+vi69mrbffJ+YGF4/S5XMPx6zX/y9i/UOrvxu5mnuVpw+137r98slbjGynR1XdqLV044icGzcfHcHeqlB/81Kh/pNL2v5pXfxG1nr2woqasFVmrSeaBdTXjd73iNt+ZzdRNeK3jdf/dPbyu9/kpt97H7obfNbv177y7FPf/5XlHzTX2O7eMr1Ot54yq4hy/+2a+56fjBLDtBvurx/v2hxl9juVF3vwBaNiv/ltVvPbR6pvVLH5nKr+/y+aTekLd4ujl3khT+p7zW/85+//708+JX7r7OJJ6+SFf3Tlf/zBZ9w//vk/3H72YPI/+dkPzb75jx/7NvpH0rNf+I1XP3P9/wD94fHFby0AAA==";
}

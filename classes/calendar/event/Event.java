package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;
import fabricated.util.List;
import calendar.util.Date;
import calendar.User;

public interface Event extends fabric.lang.Object {
    public calendar.event.Event calendar$event$Event$(
      final int uid_, final fabric.lang.security.Label timeLbl_,
      final fabric.lang.security.Label infoLbl_,
      final calendar.util.Date startTime_, final calendar.util.Date endTime_,
      final java.lang.String name_, final java.lang.String note_,
      final fabricated.util.List attendees_,
      final fabricated.util.List viewers_, final calendar.User creator_);
    
    public java.lang.String toString();
    
    public int hashCode();
    
    public boolean equals(final fabric.lang.security.Label iLbl,
                          final fabric.lang.security.Label tLbl,
                          final calendar.event.Event o);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512012804000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "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";
    public static interface calendar$event$Event$_split_0
      extends fabric.lang.Object {
        public int get$uid();
        
        public int set$uid(int val);
        
        public int postInc$uid();
        
        public int postDec$uid();
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_0 {
            public int get$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$uid();
            }
            
            public int set$uid(int val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$uid(val);
            }
            
            public int postInc$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postInc$uid();
            }
            
            public int postDec$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postDec$uid();
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
            public int get$uid() { return this.uid; }
            
            public int set$uid(int val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.uid = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public int postInc$uid() {
                int tmp = this.get$uid();
                this.set$uid((int) (tmp + 1));
                return tmp;
            }
            
            public int postDec$uid() {
                int tmp = this.get$uid();
                this.set$uid((int) (tmp - 1));
                return tmp;
            }
            
            int uid;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    this.
                        get$$root().
                        get$jif$calendar_event_Event_L().
                        join(
                          this.
                              $getStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              toLabel(
                                this.$getStore(),
                                fabric.lang.security.LabelUtil._Impl.
                                    readerPolicy(
                                      this.$getStore(),
                                      this.get$$root().
                                          get$jif$calendar_event_Event_p(),
                                      fabric.lang.security.PrincipalUtil._Impl.
                                          topPrincipal()),
                                fabric.lang.security.LabelUtil._Impl.
                                    writerPolicy(
                                      this.$getStore(),
                                      this.get$$root().
                                          get$jif$calendar_event_Event_p(),
                                      fabric.lang.security.PrincipalUtil._Impl.
                                          topPrincipal())),
                          true));
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
                out.writeInt(this.uid);
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
                this.uid = in.readInt();
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
                this.uid = src.uid;
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
        
        public static final byte[] $classHash = new byte[] { 104, -42, -88, -32,
        -30, -58, 5, -62, -120, 101, 76, 47, 62, -50, -32, 84, 5, 49, -105, -54,
        -9, -49, -17, 38, 64, -5, -9, 81, -3, -96, 67, -12 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012804000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_0
      get$calendar$event$Event$_split_0();
    
    public calendar.event.Event.calendar$event$Event$_split_0
      set$calendar$event$Event$_split_0(
      calendar.event.Event.calendar$event$Event$_split_0 val);
    
    public static interface calendar$event$Event$_split_1
      extends fabric.lang.Object {
        public fabric.lang.security.Label get$timeLbl();
        
        public fabric.lang.security.Label set$timeLbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.security.Label get$infoLbl();
        
        public fabric.lang.security.Label set$infoLbl(
          fabric.lang.security.Label val);
        
        public calendar.util.Date get$startTime();
        
        public calendar.util.Date set$startTime(calendar.util.Date val);
        
        public calendar.util.Date get$endTime();
        
        public calendar.util.Date set$endTime(calendar.util.Date val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_1 {
            public fabric.lang.security.Label get$timeLbl() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$timeLbl();
            }
            
            public fabric.lang.security.Label set$timeLbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$timeLbl(val);
            }
            
            public fabric.lang.security.Label get$infoLbl() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$infoLbl();
            }
            
            public fabric.lang.security.Label set$infoLbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$infoLbl(val);
            }
            
            public calendar.util.Date get$startTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$startTime();
            }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$startTime(val);
            }
            
            public calendar.util.Date get$endTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$endTime();
            }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$endTime(val);
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_1._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_1 {
            public fabric.lang.security.Label get$timeLbl() {
                return this.timeLbl;
            }
            
            public fabric.lang.security.Label set$timeLbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.timeLbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label timeLbl;
            
            public fabric.lang.security.Label get$infoLbl() {
                return this.infoLbl;
            }
            
            public fabric.lang.security.Label set$infoLbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.infoLbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label infoLbl;
            
            public calendar.util.Date get$startTime() { return this.startTime; }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.startTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date startTime;
            
            public calendar.util.Date get$endTime() { return this.endTime; }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.endTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date endTime;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       this.get$$root().get$jif$calendar_event_Event_L());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$Event$_split_1) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_1.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.timeLbl, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.infoLbl, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.startTime, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.endTime, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.timeLbl =
                  (fabric.lang.security.Label)
                    $readRef(fabric.lang.security.Label._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.infoLbl =
                  (fabric.lang.security.Label)
                    $readRef(fabric.lang.security.Label._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
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
                this.$root = (calendar.event.Event)
                               $readRef(calendar.event.Event._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.event.Event.calendar$event$Event$_split_1._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_1._Impl)
                    other;
                this.timeLbl = src.timeLbl;
                this.infoLbl = src.infoLbl;
                this.startTime = src.startTime;
                this.endTime = src.endTime;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.Event.calendar$event$Event$_split_1.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_1._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_1._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_1.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_1.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_1.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_1.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_1.
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
                             calendar$event$Event$_split_1._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 104, -42, -88, -32,
        -30, -58, 5, -62, -120, 101, 76, 47, 62, -50, -32, 84, 5, 49, -105, -54,
        -9, -49, -17, 38, 64, -5, -9, 81, -3, -96, 67, -12 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012804000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_1
      get$calendar$event$Event$_split_1();
    
    public calendar.event.Event.calendar$event$Event$_split_1
      set$calendar$event$Event$_split_1(
      calendar.event.Event.calendar$event$Event$_split_1 val);
    
    public static interface calendar$event$Event$_split_2
      extends fabric.lang.Object {
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public java.lang.String get$note();
        
        public java.lang.String set$note(java.lang.String val);
        
        public fabricated.util.List get$attendees();
        
        public fabricated.util.List set$attendees(fabricated.util.List val);
        
        public fabricated.util.List get$viewers();
        
        public fabricated.util.List set$viewers(fabricated.util.List val);
        
        public calendar.User get$creator();
        
        public calendar.User set$creator(calendar.User val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_2 {
            public java.lang.String get$name() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$name(val);
            }
            
            public java.lang.String get$note() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$note();
            }
            
            public java.lang.String set$note(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$note(val);
            }
            
            public fabricated.util.List get$attendees() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$attendees();
            }
            
            public fabricated.util.List set$attendees(
              fabricated.util.List val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$attendees(val);
            }
            
            public fabricated.util.List get$viewers() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$viewers();
            }
            
            public fabricated.util.List set$viewers(fabricated.util.List val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$viewers(val);
            }
            
            public calendar.User get$creator() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$creator();
            }
            
            public calendar.User set$creator(calendar.User val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$creator(val);
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_2._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_2 {
            public java.lang.String get$name() { return this.name; }
            
            public java.lang.String set$name(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.name = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String name;
            
            public java.lang.String get$note() { return this.note; }
            
            public java.lang.String set$note(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.note = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String note;
            
            public fabricated.util.List get$attendees() {
                return this.attendees;
            }
            
            public fabricated.util.List set$attendees(
              fabricated.util.List val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.attendees = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabricated.util.List attendees;
            
            public fabricated.util.List get$viewers() { return this.viewers; }
            
            public fabricated.util.List set$viewers(fabricated.util.List val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.viewers = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabricated.util.List viewers;
            
            public calendar.User get$creator() { return this.creator; }
            
            public calendar.User set$creator(calendar.User val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.creator = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.User creator;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       this.get$$root().get$jif$calendar_event_Event_info());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$Event$_split_2) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_2.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.name);
                $writeInline(out, this.note);
                $writeRef($getStore(), this.attendees, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.viewers, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.creator, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.name = (java.lang.String) in.readObject();
                this.note = (java.lang.String) in.readObject();
                this.attendees = (fabricated.util.List)
                                   $readRef(fabricated.util.List._Proxy.class,
                                            (fabric.common.RefTypeEnum)
                                              refTypes.next(), in, store,
                                            intraStoreRefs, interStoreRefs);
                this.viewers = (fabricated.util.List)
                                 $readRef(fabricated.util.List._Proxy.class,
                                          (fabric.common.RefTypeEnum)
                                            refTypes.next(), in, store,
                                          intraStoreRefs, interStoreRefs);
                this.creator = (calendar.User)
                                 $readRef(calendar.User._Proxy.class,
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
                calendar.event.Event.calendar$event$Event$_split_2._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_2._Impl)
                    other;
                this.name = src.name;
                this.note = src.note;
                this.attendees = src.attendees;
                this.viewers = src.viewers;
                this.creator = src.creator;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.Event.calendar$event$Event$_split_2.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_2._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_2._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_2.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_2.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_2.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_2.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_2.
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
                             calendar$event$Event$_split_2._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 104, -42, -88, -32,
        -30, -58, 5, -62, -120, 101, 76, 47, 62, -50, -32, 84, 5, 49, -105, -54,
        -9, -49, -17, 38, 64, -5, -9, 81, -3, -96, 67, -12 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012804000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_2
      get$calendar$event$Event$_split_2();
    
    public calendar.event.Event.calendar$event$Event$_split_2
      set$calendar$event$Event$_split_2(
      calendar.event.Event.calendar$event$Event$_split_2 val);
    
    public java.lang.String toString_remote(
      final fabric.lang.security.Principal worker$principal);
    
    public int hashCode_remote(
      final fabric.lang.security.Principal worker$principal);
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_L();
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_info();
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_time();
    
    public fabric.lang.security.Principal get$jif$calendar_event_Event_p();
    
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
        
        public calendar.event.Event.calendar$event$Event$_split_1
          get$calendar$event$Event$_split_1() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_1();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_1
          set$calendar$event$Event$_split_1(
          calendar.event.Event.calendar$event$Event$_split_1 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_1(val);
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          get$calendar$event$Event$_split_2() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_2();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          set$calendar$event$Event$_split_2(
          calendar.event.Event.calendar$event$Event$_split_2 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_2(val);
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_L();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_info() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_info();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_time() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_time();
        }
        
        public fabric.lang.security.Principal get$jif$calendar_event_Event_p() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_p();
        }
        
        public calendar.event.Event calendar$event$Event$(
          int arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, calendar.util.Date arg4,
          calendar.util.Date arg5, java.lang.String arg6, java.lang.String arg7,
          fabricated.util.List arg8, fabricated.util.List arg9,
          calendar.User arg10) {
            return ((calendar.event.Event) fetch()).calendar$event$Event$(
                                                      arg1, arg2, arg3, arg4,
                                                      arg5, arg6, arg7, arg8,
                                                      arg9, arg10);
        }
        
        public boolean equals(fabric.lang.security.Label arg1,
                              fabric.lang.security.Label arg2,
                              calendar.event.Event arg3) {
            return ((calendar.event.Event) fetch()).equals(arg1, arg2, arg3);
        }
        
        public java.lang.String toString_remote(
          fabric.lang.security.Principal arg1) {
            return ((calendar.event.Event) fetch()).toString_remote(arg1);
        }
        
        public static final java.lang.Class[] $paramTypes0 = null;
        
        public java.lang.String toString$remote(
          final fabric.worker.remote.RemoteWorker $remoteWorker,
          fabric.lang.security.Principal arg1) {
            if ($remoteWorker ==
                  fabric.worker.Worker.getWorker().getLocalWorker())
                return toString();
            else
                try {
                    return (java.lang.String)
                             fabric.lang.Object._Proxy.
                             $getProxy(
                               $remoteWorker.issueRemoteCall(this, "toString",
                                                             $paramTypes0,
                                                             null));
                }
                catch (fabric.worker.remote.RemoteCallException $e) {
                    java.lang.Throwable $t = $e.getCause();
                    throw new fabric.common.exceptions.InternalError($e);
                }
        }
        
        public int hashCode_remote(fabric.lang.security.Principal arg1) {
            return ((calendar.event.Event) fetch()).hashCode_remote(arg1);
        }
        
        public static final java.lang.Class[] $paramTypes1 = null;
        
        public int hashCode$remote(
          final fabric.worker.remote.RemoteWorker $remoteWorker,
          fabric.lang.security.Principal arg1) {
            if ($remoteWorker ==
                  fabric.worker.Worker.getWorker().getLocalWorker())
                return hashCode();
            else
                try {
                    return (java.lang.Integer)
                             $remoteWorker.issueRemoteCall(this, "hashCode",
                                                           $paramTypes1, null);
                }
                catch (fabric.worker.remote.RemoteCallException $e) {
                    java.lang.Throwable $t = $e.getCause();
                    throw new fabric.common.exceptions.InternalError($e);
                }
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Label arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.lang.security.Principal arg4,
          fabric.lang.Object arg5) {
            return calendar.event.Event._Impl.jif$Instanceof(arg1, arg2, arg3,
                                                             arg4, arg5);
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          fabric.lang.security.Label arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.lang.security.Principal arg4,
          fabric.lang.Object arg5) {
            return calendar.event.Event._Impl.jif$cast$calendar_event_Event(
                                                arg1, arg2, arg3, arg4, arg5);
        }
        
        public _Proxy(Event._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.Event {
        public calendar.event.Event calendar$event$Event$(
          final int uid_, final fabric.lang.security.Label timeLbl_,
          final fabric.lang.security.Label infoLbl_,
          final calendar.util.Date startTime_,
          final calendar.util.Date endTime_, final java.lang.String name_,
          final java.lang.String note_, final fabricated.util.List attendees_,
          final fabricated.util.List viewers_, final calendar.User creator_) {
            ((calendar.event.Event._Impl) this.fetch()).jif$init();
            {
                {
                    this.get$calendar$event$Event$_split_0().set$uid((int)
                                                                       uid_);
                    this.get$calendar$event$Event$_split_1().set$timeLbl(
                                                               timeLbl_);
                    this.get$calendar$event$Event$_split_1().set$infoLbl(
                                                               infoLbl_);
                    this.get$calendar$event$Event$_split_1().set$startTime(
                                                               startTime_);
                    this.get$calendar$event$Event$_split_1().set$endTime(
                                                               endTime_);
                    this.get$calendar$event$Event$_split_2().set$name(name_);
                    this.get$calendar$event$Event$_split_2().set$note(note_);
                    this.get$calendar$event$Event$_split_2().set$creator(
                                                               creator_);
                    this.get$calendar$event$Event$_split_2().set$attendees(
                                                               attendees_);
                    this.get$calendar$event$Event$_split_2().set$viewers(
                                                               viewers_);
                }
                this.fabric$lang$Object$();
            }
            return (calendar.event.Event) this.$getProxy();
        }
        
        public java.lang.String toString() {
            return java.lang.Integer.toString(
                                       this.get$calendar$event$Event$_split_0(
                                              ).get$uid());
        }
        
        public int hashCode() {
            return this.get$calendar$event$Event$_split_0().get$uid();
        }
        
        public boolean equals(final fabric.lang.security.Label iLbl,
                              final fabric.lang.security.Label tLbl,
                              final calendar.event.Event o) {
            try {
                return this.get$calendar$event$Event$_split_0().get$uid() ==
                  o.get$calendar$event$Event$_split_0().get$uid();
            }
            catch (java.lang.NullPointerException exc$0) {
                throw new fabric.common.exceptions.ApplicationError(exc$0);
            }
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
        
        public calendar.event.Event.calendar$event$Event$_split_1
          get$calendar$event$Event$_split_1() {
            return this.calendar$event$Event$_split_1;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_1
          set$calendar$event$Event$_split_1(
          calendar.event.Event.calendar$event$Event$_split_1 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_1 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_1 calendar$event$Event$_split_1;
        
        public calendar.event.Event.calendar$event$Event$_split_2
          get$calendar$event$Event$_split_2() {
            return this.calendar$event$Event$_split_2;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          set$calendar$event$Event$_split_2(
          calendar.event.Event.calendar$event$Event$_split_2 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_2 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_2 calendar$event$Event$_split_2;
        
        public java.lang.String toString_remote(
          final fabric.lang.security.Principal worker$principal) {
            if (fabric.lang.security.LabelUtil._Impl.
                  relabelsTo(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal(),
                                worker$principal)),
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal(),
                                worker$principal),
                          fabric.lang.security.LabelUtil._Impl.topInteg())) &&
                  fabric.lang.security.LabelUtil._Impl.
                  relabelsTo(
                    this.get$jif$calendar_event_Event_L(),
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()))))
                return this.toString();
            else
                throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                        );
        }
        
        public int hashCode_remote(
          final fabric.lang.security.Principal worker$principal) {
            if (fabric.lang.security.LabelUtil._Impl.
                  relabelsTo(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal(),
                                worker$principal)),
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal(),
                                worker$principal),
                          fabric.lang.security.LabelUtil._Impl.topInteg())) &&
                  fabric.lang.security.LabelUtil._Impl.
                  relabelsTo(
                    this.get$jif$calendar_event_Event_L(),
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$calendar_event_Event_p(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()))))
                return this.hashCode();
            else
                throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                        );
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L,
                     final fabric.lang.security.Label jif$info,
                     final fabric.lang.security.Label jif$time,
                     final fabric.lang.security.Principal jif$p) {
            super($location);
            this.jif$calendar_event_Event_L = jif$L;
            this.jif$calendar_event_Event_info = jif$info;
            this.jif$calendar_event_Event_time = jif$time;
            this.jif$calendar_event_Event_p = jif$p;
        }
        
        private void jif$init() {
            this.
              set$calendar$event$Event$_split_0(
                (calendar$event$Event$_split_0)
                  new calendar.event.Event.calendar$event$Event$_split_0._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
            this.
              set$calendar$event$Event$_split_1(
                (calendar$event$Event$_split_1)
                  new calendar.event.Event.calendar$event$Event$_split_1._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
            this.
              set$calendar$event$Event$_split_2(
                (calendar$event$Event$_split_2)
                  new calendar.event.Event.calendar$event$Event$_split_2._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Label jif$L,
          final fabric.lang.security.Label jif$info,
          final fabric.lang.security.Label jif$time,
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      jif$L.
                          meet(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal())),
                            true),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.topInteg()),
                      true),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof calendar.event.Event) {
                calendar.event.Event c =
                  (calendar.event.Event) fabric.lang.Object._Proxy.$getProxy(o);
                boolean ok = true;
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_L(), jif$L);
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_info(),
                                 jif$info);
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_time(),
                                 jif$time);
                ok =
                  ok &&
                    fabric.lang.security.PrincipalUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_p(), jif$p);
                return ok;
            }
            return false;
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          final fabric.lang.security.Label jif$L,
          final fabric.lang.security.Label jif$info,
          final fabric.lang.security.Label jif$time,
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.Event._Impl.jif$Instanceof(jif$L, jif$info,
                                                          jif$time, jif$p, o))
                return (calendar.event.Event)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return this.jif$calendar_event_Event_L;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_L;
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_info() {
            return this.jif$calendar_event_Event_info;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_info;
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_time() {
            return this.jif$calendar_event_Event_time;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_time;
        
        public fabric.lang.security.Principal get$jif$calendar_event_Event_p() {
            return this.jif$calendar_event_Event_p;
        }
        
        private fabric.lang.security.Principal jif$calendar_event_Event_p;
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   this.get$jif$calendar_event_Event_L(
                          ).meet(this.$getStore(),
                                 this.get$jif$calendar_event_Event_info(),
                                 true));
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      this.$getStore(),
                      this.
                          get$jif$calendar_event_Event_L().
                          meet(
                            this.
                                $getStore(),
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  this.$getStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        this.$getStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        this.$getStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal())),
                            true),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            this.$getStore(),
                            fabric.lang.security.LabelUtil._Impl.topInteg()),
                      true).confPolicy());
            $initPartitions();
            return (calendar.event.Event) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$Event$_split_0().fabric$lang$Object$();
            this.get$calendar$event$Event$_split_1().fabric$lang$Object$();
            this.get$calendar$event$Event$_split_2().fabric$lang$Object$();
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
            $writeRef($getStore(), this.calendar$event$Event$_split_1, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$Event$_split_2, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_L, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_info, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_time, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_p, refTypes,
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
            this.calendar$event$Event$_split_1 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_1)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_1.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.calendar$event$Event$_split_2 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_2)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_2.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_info =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_time =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_p =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.Event._Impl src = (calendar.event.Event._Impl) other;
            this.calendar$event$Event$_split_0 =
              src.calendar$event$Event$_split_0;
            this.calendar$event$Event$_split_1 =
              src.calendar$event$Event$_split_1;
            this.calendar$event$Event$_split_2 =
              src.calendar$event$Event$_split_2;
            this.jif$calendar_event_Event_L = src.jif$calendar_event_Event_L;
            this.jif$calendar_event_Event_info =
              src.jif$calendar_event_Event_info;
            this.jif$calendar_event_Event_time =
              src.jif$calendar_event_Event_time;
            this.jif$calendar_event_Event_p = src.jif$calendar_event_Event_p;
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
            
            public java.lang.String get$jlc$ClassType$fabric$1() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric$1();
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
            
            public java.lang.String get$jlc$ClassType$fabric$1() {
                return this.jlc$ClassType$fabric$1;
            }
            
            public java.lang.String jlc$ClassType$fabric$1;
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.jlc$CompilerVersion$fabric);
                out.writeLong(this.jlc$SourceLastModified$fabric);
                $writeInline(out, this.jlc$ClassType$fabric);
                $writeInline(out, this.jlc$ClassType$fabric$1);
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
                this.jlc$ClassType$fabric$1 = (java.lang.String)
                                                in.readObject();
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
    
    public static final byte[] $classHash = new byte[] { 104, -42, -88, -32,
    -30, -58, 5, -62, -120, 101, 76, 47, 62, -50, -32, 84, 5, 49, -105, -54, -9,
    -49, -17, 38, 64, -5, -9, 81, -3, -96, 67, -12 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512012804000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "lHY9lo07Ie+6UlWZi2pNrQbEXtjY+/08GVmoLhxgAzIJvQCW3giszqCCZ8Coro1lwqrReFKJSccW6dKm+fSYTsFic5RYHVxZ6hEbp2kVbmRNIEyw21ObtcS2g9KPyuSRF8IY/I1Y5OY+wrXO2a3myLwjJWI2jvR4IE0mkNF9d/CM2itlK85Ga9uXWNCuqO4M9aBk7WlutVIxegwyrqYVCS8XLITvNEFTXTQXZBAjDdsqWQtDjzW5l2zsnB6XOBEwB2PCUDfnmkvMhNyaPW+yCIfXwdJSB2fARDBA9znlryMDg8AG2TLjYSnYwhGhxGWzCcRjIglFsy4I8UiL5xQIQHomzYs7R6zPaM/GM0Ncv8XR6HDBBIHC6lWwdYYMx5JBZVhW0+0NtA/LftIFbsWpPOfvNhTogOLJWPhZu1AkDR2XArfHHdkLY2U7xx3Pmb025xbbyg3wpi9CNMBmAVyYQ5hzYr3SKVSRyz3ajEe+R6x6djFOVRvr08ESER7tm7VvLpOlQJDI+ZIq2ClCBM8VAWIxLz8roxErdM8digr11MDlm+N6Z1GXwIaRzgPCxfaizOOEE7idV6g84ESqZQcdQOcm2tHS4RRIO6k9pPulvRr7LKp5+nSaIdJmjfQocC73wqiQvqg7Ep0FG2ywiOiETu5KtxtQp9F5Ndbpq02Bbi76TjG4JkJctSgSYRn2Uw8fs3bP4wczQEIJHQRK3y1ARjKUQZk4YhPEtH7IupYh+z1Mi+ZpcK1IKTF2qVuH2nKSObZuBfBMTwSRJPYgiKhc8dilrtaLOpwU1DwB7dHIPG+KvECE+cNRNSZhPI02yjiutCWM01INGnrBouDCnQH0yjuxFuMXFQxghpdQa0sSyGI3nu2Lqs8GVnActdsxwrEqyhhNKBEr5CGm9ozS5mh8lnKn6dQuBlS8NiD2IKJKS2PssA7M0xExyH6GxlS7xitDGmKibHEHW4ZEgAXcLkHdBEn9WBSYTVvopFcRcV9suGSGtMbUu1vgsJJtitlA5KTxJEjLOIPBDBVxR+YcuUEZ7WBebFYpEOe+Tu72R4JplgebcxTohG1xvTBPa68SHUUcqZhgkdnde/rF3VFQB+3KloNDoMrP8iToK6Uu4WgZCdspw2NbpCm2myzJJmnnzJOHnbElDtKlrNPEpGRFb9Nd1yzrbQBokLJMFtDCoHP+2Bb8MYVPwtQsgKgAV8sq2mIgB5JBB+/UJlmLtjxhO7EbLvmOTGohWfh025m+FvX8ppPEy5jCCaR6a8D1ztnFyFZTiiKH0bDXIlqINWa2A+ZtL/UonDPguD5cJveC2hhtlR2eXlI2ZXSE4YLixEM+QGwUN89pZ1WZcKDXZ94M7Rq4frUB1j0BlDBoUz5fxzaz0C2REZEoX2KthB7PGu/S+10H+NVs8Pk0Ciu/LDKhZi5pX8yTO8qXlBBMJSh7OqKCOPFTcDSS2Ed7Ez9jnqUDBa3t4dRUZjAM6voRFhstry9Rh+9wpkk3DFJu+67Fm3FYFBhGO+0K1ZJW0W2D6pSFeFpBu71jpmvyYOwg9TRV9CGHh6aOQ7+cLPPY6MoIdDDgOpqy6ChmcVgTTu+Dm4slEJETd8rFsntiXkgBwqleMNGMP0ePBib+4CO0AJ7c0TYHZUGjfT3GRag1SzA6UiesXJVld2mG7rimtsPK4jCVyn0qxo5RVZIACHcXa6lXsECvBGJx6A1kMbUZWMxR02Q9/DzEy4TO1u7EIgSaMEtiC7PAYrk1aWqLFD7P48Tq4giG0e1P+Ara7ql+oS4HWjswrGKdwQ7csRXJ5w7UpLzdeMyqlus5ciy4kFXhGZ+sjgy9C8ylDNj1KLsAKJyxVaTv5sXB1qYxrAUCQ09wIWzTDp2BmgkJs9KQ0nlk631NGmefC/rjBdd27dAm+xZWmBpHkHTiJuDCekvdGXyQOXHpDGcUlppBEsVZWYkEzjAZ52DkwtWYpdiArvjqIul8qPNIhDBHi9ujgyheQlsiFalFhNgNqoAjzTYxgqKJME+DCH5gwOqkjXSpoY64LZcr3xEpWzvL3OjANpXiddxcqmUj+ihY4qBnVN6+tFSw5pnoYBOJvAjaXakNNjJY6qyshbnTCzTAac7aKlm2WG97pU6Eqo7Ldb81R29nKaZBSoU1wmd5BQqoC6tQ2yMu485YhrksUXJAHe6yVypwHwHuMMJ4bg+DcpHtgvGSyXeitvUJmslspTs4R4vC9g6wPimXYkNDWboFQEsNDKiFWPEwDMhGdnAv5ntGciB42UfcatONU6naJoYiIYtqHFtoGFtS6dZhuhBElEpk4x45iUfhtK5KxxGmkQ4JlOgaCDtZA79EG/VsN1jK4mMOyN28FkZoJ5YP5HFTy+dxXo0C6DaYMAtKVBnaQMYwr9PogV+HIGS7wlJgw3qMKrQz2AunF7Y8dv6yVwFrRZluEWPrFkTSBUUttoBbrVze5HWfPwAVnAMlwJ6Cbu6vGSHS3iOxRMJHqkMH/4CmqFcY5wuzPycavmO4VbwM83bGF965TK0W381xcUZbMjd7rSO7QgjEVumN3/tHZ0df4inlVvDOQoPq0Lo2EMJ4IpHTydipF51UxYZA56W+U1l7WR21XkTtUYXkidnTMRTv+dkKAipYR/XxTKYkFMSbovfrkVoF8WlT95mJZik/kRijagZgEk2aY/60dtdJS8RhvXTH0R/7KjygkQqlC0u89DEU+jSVVeQsJnV+EKUOG3D2+lOA73n0W4ivvv2E48nPbO9/AnEtO73dbwc+/kpnFAe9XKxkcSoR8CI2SdHGjm8d1apW5HWwWxyYfNfSXtEgDJNusvM59E8q2+tATZTHBofRYLdRqnijVjI3MHNA3Oa7PZ4MYFh7Dhm68CAfh02z8verrS/v+YDBuPVSbofunKcQVQwXzu/HNbl27cs66qWNPgq4Lc5h5rg8aLsqcUY0R1bHcWW37XGoL0h0OGdpwAsnqmIh1keZcWg5sWjlyvRgcmTIDWXa2ErBlsP50O2LZQw6DlgnwIzQvZBOCI6UmIg48Ydpwtg4YiLPH6PJkdwUvRzcI0uu6gFumxoCKcdigl0zNUIRbRSNlmHiIhpZICaaKB+OS2fHKhVOoSIrR04p7XsDiCluZS0qeAfxabw8h3P8kstgUVmsLJj1MsUoK+KISjEPAVItw4LLYLmKyEDMV5qJH/rCxhFlB7Ccwxh7jA1SrXBcfQ3KuypcTWctkMIyteE+cpmEl+TVHm+5+mA367Jfsoo6h4ytaKSdANjGkYuOMG5ZchsPmZKfSWuN9gpiVNQpJHdbyvPY2WuM0gxN8u7Ym4SRUQYBOFpEqceFqZ+ndIerG+W0y/J4OBKpFF6Ymmg9j6+PM2RxqZCyjVYbo2zZix5pxjp/3gUKm+yw2ok1mimHJCzAg3MC3WY9aYqWL0lr3DBqpaN4WNoJPi3aSTSOAlyEuGPBcsHBKRVkzFbL0kuSlyrJmI1+mQMsUCe1DnNMHym0z6F8hy+Gqh99fMxqAsFM34jItQFby4O/nl1KIl12l2PFsNiZOlO1HpULSKLqeIIkUbGE3XD2YOJY+usE0BFf6vnLNnWXpYLFQFkL8moJytCgItP+oApottuvtVLaXgh/UvZ8BswTIKsI1Q6yXzpIjIT5SC6USnAgMZpXqGKt4lTMNpJ12oUkBxFOZuRSJNKTjsvOISATISkPa3iLkFCi0dwskoznCGZ5bPtAbejaCMTAAddGUoxcM9PZk1J0uuAcY+3dcIjjYJaPcbaxicPFRjgT7ZrrXUOhTd86FJTJUqpE+tRMAGNSbCTReA47rZQQ/UZjVQqN59UDzhXhanvYjOzOhyjGrxJd2RwFiqatHqDPxUi7NWsgLWaW6RwJTksewtV119CG09kLOXXldb2cF+pT04E813RbrV91ECxVuOwJciiuD/AM9T2MGLODO8e7upZNaY7f/mat1pg1ZkuvpodgOg/TBhzlVHV39WJ90jR+h1Ksv8bPcMPRqc0wYcoxq6Yu+oMkZu5Enp1FSyPDEl5vClYYoxlHGdo5QrdoQHjmeWU2C8qqcQXf705jomwJpCht+6IIeLJXFBdvpqjUvIDXqB2i6UjbzMvexRLahOOxqYFa6uyVu9Qb2cmoGAhUidoC2MSjzj5eiqdxu8GCvbfYD9TBDlyBI3WUpGvnrLd5EjvlmQVPTIm2uw7fowkGlid3seS0cjnDr3KJW+bhmGrHhEAzvFhcVLFiNms6ktUNPmTddlsvdCJCcvLE7orldgmnpJL7riNG2C3vYofAepTiSc7iAaNDduaDifpjSvCLLaab8tJmKdNY+WeEqbt1uti3y5jchGKClbIdsZs40pNBIcJJhAkKoQ1FNNEImdf8E00cyVMRjqejfcYmPHGjbkbJT94zV8cKFNi4vMtlUHuw7N3YETE7YsqpMe1h1R5swZuyTb+D2VZMQNy10dTpwJPotGe+yMejYTeNOgE048bbYF20sxNqQQ7rVahMfAFaDsLZG2nU6doCNBXV4/icytdOv6P6vtCtwjBzl0F8GTJKleIBizw60Y4NVuhi9IlilZr7ZrmN1QW1Ds6EXC8MBYsmpnbNCC3UbtsGe04Dp6Qjqr4kdiSIb0R/dtDcyR4ow1TDdL89FvJSDiNQDEMw8wssW+ywKeaSSVBx3qj19Yyy0AAzmCxaEGa4TezLdoQx0sY7lA5yGmMUvfD2PNl54i4EYtzecR6FY/qeGIbjvOqzEjrWZdQv0fMo4XCI5Rp/MltzbRoGHhTsvEjICwXDfWaYQmmPRc3VjxYb5CQdlJGHUYCD1UvPFxTHiMw5PGiX2fc3N9+vlZFYRdiRXwepPlaoriQ0WYuBniC5kBwFhdiru30oHDZLsJyXCw1uCN2SD4q9Yu5zFG5YDlQCKB7oZaIeAqXTWkHQhQEazU1OyN1gkAeVEBOF3m+teVGr0aykaENlnkCR0MScXMR5XRwsmURERk+KBQsu4MAs/IBEtsxlg590EKJKmx0bClbnuEiC+d4+TC3tQvt5be1OQuPwbgOAq1bdq/LFbQXDOQuM5cvnFboLMt4QfWd10vYyll2aHpVZcpzAaLUCzoOF5VCl7kF+35cpsZxClK3OFUyDa4sxCMW2sLjJz+LGgJ2TiazKvoa08IIeCrqa0C0+oV7OwZExT3+89EF/cxwWNH5iZTBa4Ps8J0QWAEVzihIk7PZxUDMNGAPwyeSKYRVk7FoCmIQJlKgIID9TFytvrPbxmZvdsyEBfmkSuXD0ELy3UsWLZAFQSamCcsMSQwYIzKlc6Js9vbEbEtpMEQsiAwuuNfKwtTNfGWLGQ1AxVddnArPws7q4IO56A53HKA9ra6fSS2m7CL2m3g/bvl9vQA9nrYIQanfrTv3W5XOjOqMcmYQ+4m4v7arf2Omo9sNlr1FFgOuzWzlvxxOhoQNB9+udd9yBtoARjDBN6mLS5ma7owuqE4q4LnVYuYKwcLeNXdMkm5CZpgcmHK92lucQEMnR/WmP98f9kk2IOQjXIntcr2oNJTgal9RgRwM1mdebNmR8RTglK3EEUV48FZS6y3g94IB+Gkq1RtyDph0KNLbXot6M2HjsGg33cot3dD5zZ0DgnvaLDI9pbOtJtdtvco8zN1LWoPjBcANHiEWrA5dKK7atiZgmnMJJmCa0n3EwzKYFt19SBsICo5FS/L6yCi4GXfQox0sysDfFYeztI7VcJyvVx3aHAiOM1QI/7GN2EDFyD6NNmvKaE+zcw1QRO3R9UfV5YSmrDAnY9GWz568Re4bInlewpEc4onfao62bjfPChzd1zQblDaZfxO0E5dTCXW8vW51FLKRpcirWa2VTo5nVQhBm4PtM3JVW33U+LRxXzlruo+qQUJTHt0tMF3zO2uS00bC02xTFFgwiAjBaVkPSkAIl9NxvhCWjtYqUgKJmT/2qwmg7b1gKHEa/WBieaI3pqZFTQxZ6QHTzgvMwVpARFzPHzMVGWlITSdhD5daOpaF3hYmFWz+qDKQIYia30WUtI+qML3WoMKJ4sdB8xxIW+Ro7ZDCm4Ksj74iYsc53bo+Dp0jpA6GooACySnzkpxzeSn0yWQRfpU0zWkyPF/BxYrOitziCw1C0Oez1bBhMM+GaCIe0XduhLh2uGSBsVFCehsuK2K33/p51L2kHcvt0hvy6lOg7zBZymTSKvegUonha9xUkMgjpjUgIsFMxnrddr7BZujbhGcxQHOGv5vVklmJR1mg1RixEQQOGC7v3ANJgPNpf1EtqLNZrWTs4IWivx/RwySxSlFjTFjfIWjkrmdjtF4BEdGvSs6vtHjjDK/6K1dScG8Sp9b2k9nRduC5Jgc1oUpnHk6UZp3XBlTrNq9tlXkU+cTHHXYJC/IqLNyXARxrinUQKFi7qgVLWw0ne4xjurbuEpU6Q3deTbmvSwS0dgy6zRYJlRda7vuzNGC1Lz0LgZafyVAUHmCazHtDWntWuSEw01u54BvaXJQp65mKp5YNEaAt2WMFrUNtgE3zaIlQsnHxlMeaegi/0k7if5CTFQFrwGIkp2jmSxPAc/K1k2y28HimFA+r0KagCFCojNrzvNtHWA3vzNCWL2qTOMNAGZGcHyIKMU8kl86FHj87ImmJwSE6lPa8pJieXjglPMkGOl656tNr0qIZsneCrNM58qelGBt95/DISulrbamqL2oIM56oY2dj5QvDnau9AfN0oiQay87LRqzpugdt2up7I8YAmVJLR0exxWnte8wUEsZtqXT268+patNn4xGxkSVltKUUriiih94zcOizmeqK/QZfDQTnNJPxAso+ibQxCLtlWrzOY4haFlIi47tYOsaxPqO3a8+r5cAGnernZYIxbaGk1XEhjs6SAaKix1dIlpGARISEEAdsaIWDeiYCS5U/FEtwD640eW9JwiZyzY5ussaYBIiAvZQc5m44EO3lct6YGYJ0lomq2utSiu6aifb8AshlvAr3TmbW0XyAhte9c/7K5lPasIJZSLg+Nma+iRel1HUhi6Lrh+eXR1Yt5lb/ZExupU8tDRRKWIbkgLmq1Kq82m8S2wnLpR+dFQAr66LipFnE63JdQtIhiJD86a0vgQJJ3Dx1sEZnLo+PlbI2W7l3oxYq1ztV5s5yRYyIogQGom5IyEixcks1mteBMgFpo1LQROexCtieq2OGGDVwifgx2LXpSIH9czbF6n5IWL0CGtGsr85xb9xekOfLaCLT9cDKB2LPGrQjkxyO9GFh8TR5doFrrFuoKDSxakr3fBB2GRcde3OmGjx4XAHzxrShdNEDvmriMbYyC2G6333nb4WQ/+sbytW/3jeVl6NmvLPfbAh/va73uZX3h7v7vhfttgT/3T2V/33c8KFuzDss2b9xX7rfNPXjc6uVbq5dvrV5+vS6SsHkdfH7pa68WxeONTt47bHS6bTdq7j4YpmnbXLfOPd5w9Knnkn685wh+uz2tLz+36bObo/4ZkQX0/NKnZZE/TxbXJH5XQoC+dCFA/4wKAX5+6dNC6L88QoC/dCHA77BN8J6/f+kddya+v6jCbhbAM/sDQ+9Jb6/fenv91tvr/JOtpm/XzR99zjR835t6+NQ79vD42IB37OQHvgydNOH9jrt37ORffdedvPNc3Qitbz3cb5n9zDX5tifWcft73yML+cFH9z96Lf2qW9Ovfmqf7d114+Gn3umkitumw5/6vs//hHP8d6EXH23W/e7ZEc+W8+3JzFPyFKkPX7cwvuUkFOF2PscbO2+/+Cuf2uDxL/n3Wxi/6Zmen6397wlf+HnqM/afePHuPU+22L7lUJA3N3rtzRtrP1S5TVtlypu21z54MlcfuM7Bh+br99/dvfTz8/2Td3fv+fqn5uqpnajPTPPN57z/UZOve3T/+LPT/MaG5w/dZulDt3f90abP6+2fb+7eE2bNE7V5stf6E0+M9ba/cz9b0+PNsk+dsXDN+XeeQIfTM1t+ry7w8cELdfMOzf/040Zf8aTHm7t8a+1b9X/7OTu5/4Nr8m82d1/ztj7ljbn8sTdL4NPztZmV9qce3X/4tyaBa5N/7dH9+99ZAk8z+peeU/YfXZO/2Nx9oMnlJ2dbnN6O72+Yrz84d/rrj+7/22+N72uTX350/1/eHd8/+5yyv3JN/vLMd2DWAZ47N43/yWf4/vC1+jfPFzXz8IVH9x99V3y/9NhYrk1+5NH9j78z3+95Y7M4+oZX";
    public static final java.lang.String jlc$ClassType$fabil$2 =
      "vNH/+ecM4xeuyV9t7t7nznE1qd/OYN5v5XnimtnbyeTrnsIFb69L1+Q/fIaBF+5Pgri51lut/+Y5HP531+S/bO4++lhBXq/cNL8Pdm+rJ0/z9PZ6ck1+5jfj6X98Dk//0zX5WzNPj4X/FE/P6sCNp4/fPYufXvhzvwvw0z1seNDlofPgGgLDLGxeefXB9z74Lrczk1eei9q/10ytzz34zgeZ2z9/0XGr+MrDhw9fffW1zz74TQlD75Yw9FskDL9bwvDThL9bfvC5K0h8ylCfBRQ3pfm+4c2Y4P3PSvxa+sWieI5W/dJzyv7uNfnbs7t5LKa3s9SXroJ8Rv2+8kriU29Rv/f/9O+6o2zepJr3Z208eITwH3mgm44+xh6598p33Q7ieHAffW9Cux1Fcf/0+MCU+7fbwSv3CnAlwn/2wZfc9gpufxvNr7D1t9L8yXkvb5Aont/+/pyU++r5d5OzPYfeg1fyB985q36bJK8+uIdpc+ukdl9753Nq1CuUMW3brWs8cO34lXc92mvL+9coD7NX7s9Auc/w3eb+9ZVXr8/8FerITV65r7z62XvR3NdLXbd59w2/BM6a/JbxO9pH5ZqOW53yWYfHL29HT7Ti6QEVT3K/bGS+tHH3c8nv8XHPhJqqdb+08Seh1yj/BPRr5pnJGte/yekarz77IL+VvPravcmHT5zlg5vLvcb228MDew6Er9zn5a89cbB5PGdfx/3a7WlOPvOZB7+Jh5iR4wwjZvc+D/kV++E7f3b47M28X/0dIH1zyY998+9EBzen/dh7/+YdvEm93nUnxa2H4tXXHvnnPH7tc29y1b8ZEHnjUxX56HC1NwOK995qvffNa4Rbsn6yDn56PPeB5DnnjP0fz0Es/+ia/P3m7ivfHLSvuf/50xjl8cl7X/8YmzzOuJa+/Ds24GvyD2+NfuOdB/HCDdr9P0++QtXN20ruDQ7fwF1Pzsd8M+566T/+LeKuf6qQ7G0/t95rxYMbCr0/z+62ZGiCsH74cls4M3O37Ksnuea9s0O4D/L3DWd3+MQTPr/ZPf66OefXHvV6D1Lu483c7ZeKU36rnLzjAH4bcOTLQuxNuONLo/h7CGD8Lh/glw1JfJn07BnI8NDOM+/RTM4GdTPrk1k1t/NA62vWoxh07f61tyyG3/zV6vb3vrdZ+r7w3uctfV/44HPKPnxN3tPcffgpj3Pz3m/ncT/21g8tv/c97u37zFsE8+Qzze2A7IdvKX9XH0Xuv848fPRv8asOvXzv319+lwSg3y4B+LkE3ubzy7vVuI8+V+O+6jllX3NNvqK5++gzc3qt+8tDc/fe2wCu58N+w9scHP3oUHMb/6vuT/0S99mveYdDo7/+LcfMP2r353/iox/4up9Q/9btROQnB5Z/kL/7gDev3p8+x/Sp5/cVleuFt2n64P2pprc5e+GTMwB78/8hZ/Zv9+toXvj6+1qfau4+8LjW9f3Tt6+ln3yS3AOlT7bV9Yj8L/zDr/tH7/uA8sVHR3zePQj+5p/54i/+3Hv/yg+4PPAH/sYXlfdCP/af/dp/8b9/5g/9v78m/vpP4v/n/w8psj89ul8AAA==";
}

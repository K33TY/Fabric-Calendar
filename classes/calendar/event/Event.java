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
    public static final long jlc$SourceLastModified$fabric = 1512012850000L;
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
        
        public static final byte[] $classHash = new byte[] { 18, -76, -63, -105,
        -119, 123, 12, -27, 24, -68, 11, -73, -93, -76, 57, -118, -95, -60, -8,
        69, -95, 73, 11, -32, -92, -116, -15, 25, 11, 4, -87, 34 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012850000L;
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
        
        public static final byte[] $classHash = new byte[] { 18, -76, -63, -105,
        -119, 123, 12, -27, 24, -68, 11, -73, -93, -76, 57, -118, -95, -60, -8,
        69, -95, 73, 11, -32, -92, -116, -15, 25, 11, 4, -87, 34 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012850000L;
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
        
        public static final byte[] $classHash = new byte[] { 18, -76, -63, -105,
        -119, 123, 12, -27, 24, -68, 11, -73, -93, -76, 57, -118, -95, -60, -8,
        69, -95, 73, 11, -32, -92, -116, -15, 25, 11, 4, -87, 34 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512012850000L;
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
    
    public static final byte[] $classHash = new byte[] { 18, -76, -63, -105,
    -119, 123, 12, -27, 24, -68, 11, -73, -93, -76, 57, -118, -95, -60, -8, 69,
    -95, 73, 11, -32, -92, -116, -15, 25, 11, 4, -87, 34 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512012850000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$2 =
      "8nOm8SvX5Jfau/f4s19Nm7dTmPc6RZH6dv52PPn6p3DB28vSNfnZZwh44f4UiJtpvdX6r59D4X97Tf6L9u4jjwXk9drPintn97Zy8jRNby8n1+QXvhhN/+NzaPqfrsnfmWl6zPynaHpWBm40fezuWfz0wl/+A4Cf7mHDg76IvQdXFxjncfvKqw++78F3+72dvvJc1P59duZ87sF3Pcj94flBx63iKw8fPnz11dc+++CLdgx9qR1Dv8uO4S+1Y/jpjr9n/+BzV5D4lKI+CyhuQvP945sxwXuf5fi19Atl+Ryp+tXnlP2Da/J3Z3PzmE1vp6kvXRn5jPh9+NrFp94ifu/9uT9wx9i8STTvz9l48AjhP7JANxl9jD2K4JXvvh3C8eDe+96YdjuG4v7p8WEp999uh67cC8C1E/GzD77stldw+3tofoWtv5vmT856eaOL8vnt789Iua9efA8963McPHilePBds+h3afrqg3uYNrdOG/+1dz6jRr9CGdt1/aYhI989v/Ilz/ba8v5rUsT5K/fnn9xnhH57//WVV6/P4hXq7Nui9l959bP3rLmvl/l++6U3/DIoa4tbxu/rGLVve36tFLMMX76yAz2RiqcnVD7J/Yp18+XNe5hL/pDPe+6orTv/y5t/Ggft4f8H+Zpp5vLWD298uvqrzz4obiWvvnav8vETY/ngZnKvvv328MCdHeEr93nFa08MbHGes6/zfu32NCff9m0PvoiFmJHjDCNm8z5P+RX34Tu/dvjsTb1f/X3o+maSH9vm348Bbkb7sfX+4gO8Sby+5EHK2wjlq689ss/F+bXPvclUfzEg8sarKvrRwWpvBhTvvtV695tjhFuCPYmDn57PvSN5zhlj//tzEMtvXZN/1N59+M1O+5r7nz2NUR6fuveJx9jkcca19OXftwlfk398a/Q77zyJF27Q7v9+8haqad+Wc29Q+AbuenI25ptx10t/43eJu/6JQrK3fd16LxUPbij0/iy7W8jQRnHz8OWu9GbibtlXS3LNe2eDcO/k7xvO5vCJJXx+s3v8dTPOrz0a9R6k3PubedgvF6f8bil5xwn8HuDIV6SzN+GOL6/HP0QA4w/4BL9iSOIrJGfPQIaHbpEHj1ZyVqibWit23d7OAm2uWY980HX4194SDL/5rdXt8563CX1fePfzQt8X3v+csg9ek3e1dx98yuLcrPfbWdyPvvVFyx9+i3t7P/MWxjx5TXM7HPvhW8q/pJci929nHj76WfwqQy/f2/eXv8QOoN9rB/BzO3ib1y9fqsR95LkS99XPKfvaa/JV7d1HnlnTa91fG9u7d98mcD0b9hvf5tDoRweau+Qv+Z//VeGzX/sOB0Z/4i1HzD9q91d++iPv+/qf1v/O7TTkJ4eVv1+8e18wR+9Pn2H61PN7ytoP4tsyvf/+RNPbmr3wyRmAvfl3yJn82/06mxc+cV/rU+3d+x7Xun7/9O1t6SefJPdA6ZNdfT0e/2f+8df/1nved/jCo+M97x58/Gf/xk/8K9/3oV/9xH/0wZ//8z+L/9Cf+6Xfov4c98EvfP5P/+Y3fPClv/iZ/w80UrN5tl8AAA==";
}

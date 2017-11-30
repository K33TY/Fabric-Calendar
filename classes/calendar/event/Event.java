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
          "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46oaL6p5Aou45yrW2FVh8I8njgMmokDfby1CBv7ZJ/xTaiyhCYf3cuw68eUI/81JERVFhJSgiuxc7Y1afA1Y/tLFy7nj3xqR77291W+pY2ax8N1f/fOn8Revvdegg45430cChdi53lX3XeeY+NoQFJ9rN3buT85dn5E6d9XYV0v92rGV9w7foz0XJk3lKlP3iaOaKVFdW9odBthmnqiqMLuqu83+upALPXwbhFzlq5wEU1lwq97dsKs8yeapMShbyqKdA2PFInSWQZsZP6Pnyy84GWFBRliQwa8DQ4lhpUII1TRAsXEL9C+UpVRIjkNTkJfLg0PIK50sCBOnJitbWRHAeBtcR4O4CA3i6o3SF9dYewpvC5x0VPjGR5/eehc2rkclTnau2dyLzIQw397grdX7CqYl32HL148Ob1rljbWv7rukx3flcnfblstTvxYvXOUvXFFo5/NFw6jslirGEdtheV14ICp7J+n3ZznpqgYpABfxFDu/IKm+zkmbT4X/l+wyNIvb04Jqa9HBb6orf97yUaTtxDXR/GON7n3jhy98dbHzet8POt569Y39z77yzkdjr6Q6ri1/7dbWjubXBv4DLXzVK+sVAAA=";
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
            catch (java.lang.NullPointerException exc$1) {
                throw new fabric.common.exceptions.ApplicationError(exc$1);
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
      "sUFcm/yxR/cff2++P/B0ozf6FPlu9P/iS4bxl6/Jz7V3H/LntTNtXmQUH3aKIvXt/EUy+aZn1v4X69I1+feeY+CV+1McbvB5q/WfvoTDv3ZNfqG9++RjBXm79rPi3gRfqCfP8vRiPbkm/+GvxdNffwlPf+Oa/OczT4+F/wxPz+vAjadP3z3vI73yZ/4R8JHuXYMHfRF5D67LXJRH7RtvPviBB9/r93b6xks98x+wM+eLD77nQe4PLw8sbhXfePjw4ZtvvvWFB78mYej9Eoa+QsLw+yUMP0v4+5QHX7w6gs8Y6vNOw01pfu/4znX/w89L/Fr635TlS7Tqv39J2Q2x/usZbh6L6UWW+tpVkM+p39ddSXzuXer34Z9+kfr9rR/+0lUB/6Fo5jtV8/6cjAePvPhHCHTT0cf+RRG88b23QzQe3K+3N6HdjpG4f3p82Mn9t9uhKfcKcCUifOHBV9326sD+OppfXdOvpPmTs1qekihf3v7+jJP76sX3sbM9R8GDN4oH3zOrfpembz64d8Xm1mnjv/XeZ8xoV+fFdl2/aajQd5M33vdory3vv8ZFlL9xf37JfcbZb++/vvHm9Vm4ukLK9fijN978wr1o7utlvt++/4ZfBWdtccv4De2j9m3Pr6Vi1uHL17ajJ1rx7IDKJ7lfMzJf3biHueQ3+bhnQm3d+V/d+NMoaNX/H/Rr5nmbt/75JqfrevWFB8Wt5M237k0+egKWD26Qe13bbw8P3HkhfOM+r3jrCcAWyZx9Hfdbt6c5+Y7vePBrIMTsOc5uxAzv85DfcB++96uFL9zM+83fANI3SH6Mzb8RHdxA+zF6/9odvEO93ncn5a2H8s23HuFzkbz1xXdA9a/liDx9HcU+OhjtnQ7FB2+1PvjOGOGWEE9i3WfHc7+QvOSMsP/1JR7L/3FNfrm9+7p3LtrX3J9/1kd5fEDeNz/2TR5nXEtf/w0b8DX5326N/u+XDOJXr8nfe/KmqWlfKLmnHD71u54cY/lOv+u1P/8V+l3/UF2yF75SvdeKBzcv9P4sulvIcDvI8PWu9GbmbtlXJLnmvTcg3C/y9w1nOHyChC9vdu9/3cD5rUe93jsp9+vN3O1X66d8pZy85wB+He7I14TYO/yOr47ibyIH4x/xAX7NPImvkZ495zI8dIs8eDSTs0HdzFqy6/Z2lmdzzXq0Bl27f+tdwfA731rdPh96Qej7yisvC31f+eBLyj58zfwH7d3Hn0GcG3q/CHE/9e4XLb/5Eff2fuZdgnnymuZ2jvXDd5W/r5ci929nHj766fuqQ6/f4/vr75MA9OslAL+UwAtev7xfjfv4SzXuky8pu/548MpH27tPPjen17q/NLZ3H7wN4Hq26297wfnOj84ed6m/4H/pl/gvfMN7nO38ze86Df5Ru5/8iU9+5Jt+QvsvbwcXPzlX/KPC3UeCOXp/9gzSZ54/VNZ+EN2m6aP3J5Le5uyVb5wdsHf+1jizf7tfR/PK19/Xmr27jzyudf3+2dvb0s8+Se4dpc929fUk+y//79/09z/0EfUXHx3PeffgMz/153/8X/qBT/zSN/+5j//Mn/ip1Q//8b/w95k/vv34L37pD/7db/n4a3/q2/4/OVPwAGFfAAA=";
}

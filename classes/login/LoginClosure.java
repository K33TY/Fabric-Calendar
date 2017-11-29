package login;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import sif.servlet.SessionPrincipal;

/**
 * P is the User[L] principal that will have the session principal added to its superiors.
 */
public interface LoginClosure
  extends fabric.lang.security.Closure, fabric.lang.Object {
    public login.LoginClosure login$LoginClosure$(
      final sif.servlet.SessionPrincipal sessionPrincipal);
    
    public java.lang.Object invoke();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1509330207000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "H4sIAAAAAAAAAL07C3QU13WzK5AQiD8CxHf1gfDVArYxIDCfBYGwABUJDHLCMpqdlQaNZoaZWbFAceykNtSOSUrANq0hpsWnNqEmTe3jnsTQmNoFf5rUjWuwc5y45LTBjokDJ3HrUzvuvfe9+e4IxDluOUfvzb559737/7w3nLwi9LVMoSYrtpmKVGvvNGSrtp5+NImmJWdSqmhZLTCcli7/7IGRneV3fTMu9GkUykRJki2rSVcVaactjGvcpmSTBJ5UxTZZTaZ0Lcve1sFsSdR0TZFENa1ZtjCocZvYLSY12U5uWN8A78s1sUu2DFGSl8uGrGVkTVJkmDiYTczZippslm2Y2c8yVMVeIxrBlzBQlzeF8YAFJ2K1kmUUABI7GQGfHHs989hm4xdxobhV6KdYGzRLzMqNQqmYszt0U7GBkCG+RRsVC7ccIOmAtCkqmm1tF+4RihuFIQqMiJqtiLacqTf1LluobDRgo3ZVt5Ny3k4aoil2cYY0ERNhpWIadRbpZ5h6t5KRTVuYWMC+Jv6uEX8haQlneU5fgXgOTU8efHTLkO8XCYNbhcGK1myLtiKBGGzAp1Uo65K72mTTWprJyJlWYagmy5lm2VREVdkFE3WtVRhmKe2aaOdM2VovW7rajROHWTkDUMQ9nUGUJ7EkJ9m66ZBTnFVkNeP86ptVxXaQ4EiPLYy8ehwHXvQHdspmFkTugPTpVLQM8iIE4dJYcydMANCSLhnk5W7VB5XHFoYxyami1p5stk1Fa4epffWcjQwe0+OiqFOgeJ1iu5y2hdHheU3sFcwqJUYgiC2Uh6fRSiClMSEp+eRzZe3C/bu1VVpciAHOGVlSEf+BADQhBLRezsommIDMAMumNT4ijjy9Ly4IMLk8NJnNef6Pry6ZMeFH59mcsRFz1rVtkyU7LR1vG/TGuNTU+UWIRj9DtxQUfoByUv4m/qYub4CDGOmuiC9rnZc/Wv9Pm+89If86LvRvEIolXc11gR4NlfQuQ1Flc6WsySaaSINQCladovcNQgk8NyqazEbXZbOWbDcIfVQaKtbpN7AoC0sgi8rgWdGyuvNsiHYHPecNQRBK4E+ogL9+8Pd93j9hC03JDRaoe3IF6ncbKExyuWx12rqRXLNCa0+DfSE/kilRBRxEcyZzeknLlJKq3q5oyUZsU6pugT3Ugn80/g/WzCMd5TtiMWDxREnPyG2iBfLiurOsSQXzWKWr4AfSkrr/dIMw/PRh0p9S12HiCnGQ+biwf/DDHswtW3H1mfRrTPcQljMQzIYwq/VjBsiUoS3VgoOuBQd9MpavTR1t+C6pTLFFtuXClwIZC1QdXHteiMWIkhEETIoCYu4EhwGOtGxq81dWb91XVQQaauzoA0LCqVUBh53yvEoDOVgJVPuni42t+28buzAu9G0Fx2stl7NiTrWbUsv0nAYOaoQ7tF4G36WRx4z02iWGRDC2MKrA3zI/C2CmtwiC1QBra8JGHYXm4L2XPz71yB7dM29bqCnwOoWQ6DWqwrIzdUnOgCS85aclxOfSp/fUUPAtBdpsoAw924TwHgHvUed4YqSlP5CX1c0uUcVXDlf62x2mvsMbIZ0cTs8jQUoD0L7ugL8ykNhG3lfj29EGthVMh1HsISrI0y9qNo5c/PH7t8SFuB+VIp/vwd8jyMsM9RSnxZRliPjvPtb07UNX9t5NWgMzqqP2qME2BT4Hoitw9v7z29/+xc+Pvxn3NM2G0Jtrg2Qk79KF40J/Tk8V78f56ILdJnv4gO9SwbYBXatmg9alZ5SsIrapMqr2p4MnzX7uw/1DmOhVGGGMNIUZN17AG69YJtz72pb/mkDLxCSMnV4u4k1jDnm4t/JS0xR3Ih75+/51/OFz4hGwU3CnlrJLJg8Zc61tlGdtpOByhkWPJ586+Uxd2dNPkpBKySAgvSAqakBQCOH8HkziHuaycTSycQZn33Lez/KrB+w7xtuXFgeU2wmBtPTUwJdfuzK6/jzpdVxSbGF8odFkXEOo87sv0N2cATGZjJojG+9WMBsNLbFRDNjbqDA+HJk+X0lkriWq7iZkBmRkSzIVw1FR3M5SuiD9hETH2a7Y1leDINwMzhQ1S4WIx/xJC71ckTdMzB+6RZMkzgwgj+ruotGEiWFauv2hvaZe/eBcVN2gGU6J4vMSP59tYQtS3aWbRociJYiwhJ5NMItPiGZ7rkvW7AQEGAtIagIvLimGSHN86VxiShuyU84kxDa9W0607Uzsbrr0wIE9U3GbZSDNSYS2Q2ltStQ03Q7Rm5aKJeW5K8nsZywjmRiEKZi9cFbqgfStf/vPcW7no8IhZJVodYA/uKheaD307rQJbFWfv+Dvf7D8/kOP/P3zt7IoAzwShixeItA/YuhUyPDDDIDtxoYVoklUTK4UI69VJY365e+RcfSX3LIGlwNDHYB5bLtTB40vCCwN3us6QmExNqm8gWTOdOoulzNO7cW3b9FhQFEZk1o6N5z/cGX+fUZ8dZClPhCPrUfKH31h2HcPLHX0qR43nRAmdr0sQpbAcExL146+I6+/7ZPfMI+t79DCBYrhMC7pshBrG5NWwV2aAbvRBRzly899+IlTV37etIS8nM+gMAMtKIJ8bPNMYSpKczo3gRTvl/pNAams8RBwEWZm5mKdlsYpXbnjv3u1iZAZSNWZ4ydsocKHT5P/VZ2r0OHlvZX3P/14yUczPnmCuOh6ieqQl3ABruspsF0aJH8aJ3tZFPlWgb0R+n7FuNj42dFFb515juwN2VUR8kVe5jH3lRNFP9n45SMsOPgyD7+8MHnzVVS8lJvQEwdZJReRtfocdVqac6Lr9/Gq4pfjQglkfuSjoObeKKo5TA1aoYS0UnwQpBd4HywHWe1T5yu77gjlRf6g0gdR8WKdp3hjkPOTeIlxhvd/5+e8INADE9x0amdiM4tCcBE+zrYxhcbS3AYUFA3yZrbB5/AvBn9/wD/cCQewB1pSvKBKuBWVLXSY8vZa7svAPy/4QmqTpZRiYGmyYM78OTPmzJl5y62Q5MearMIyFZS3CxK4bl6myvsOPvh57f6DLAtiClBdUE77YbgWUEKBTSdqbuX1diGI+l+d2vPDp/bsZW5wWLAyXaHluv7mrc9er33svVciqp1S11idrHVcD4pPW1X9smRvw+XVkBgVUe2R0sk0NRbuaKhBCw4NUCzXqok0km6uoNzxvEaLbvgcx5aR/zJ93Aub/9Rx2a3Y3JWnbDRg034wv2mPKn/3zfPdq34THSWiIBbPGXHm8uiK3a4zKIgQd5mK7UWIRG3j2X8oWf+qL0KQ2wdHt4MmsiCAbQsLdtje46YOIfqX6bat+73youp3ttV99sazARakkAVTg9SEIAPpx7QfVuz/2b3rnDV2GySHr/KlsLvPCIoffFgj1rGeA2r5xrkLcw9fPkCK1Ff114RhYwhBqsfVc42/2/ljZ3spmDAv4m57Q1TCHGNOZG+0E4nh4zZatBObO2nCfGyYKa2lgTGQBVtAGviEbhXK+OZw0oOTJgTKd8rvsPkGPc6jKbdQezsiTdszcv6Mciko9sMvaaARm2mQkA7JsMI8YfB8FF98m+aso3ZVKEWjwfUMHNtHaSDPBuh5l9HT0B4P7HFP1tNcWfcw1Mg8jw31qA/JY71CspN2e9JburNwt+DQHg/shEdIZyFt7hDrK70Tk4ij+no8efWULz6moWXesfxdpLYD2EG9e6ARy4eVPgQt7Vr0nwf+sL2GfN6gDhE8HPhfPCaWTUp33V+2MDQc4OtuZCehzVqTJx8fk7rj1+xQy00uEHpKyHCGIfPnsaI9NpIX77+NMJxnow0nbgsl4HQgDZOZCQWPAobyFT/i/SXfylFFA1ldELnJHLk+UcgxZXMBqiIAYoIfgLrTN9RDd8VqJzvBlYp4H/OviO2LNH9TEKqGz45HQdHULb68htY5W2h7Z+jFeU/1zxRagztEfgabcia004Qcezsdm1oXRfpXzNOt7/D+sA/FkIVUR1hIc67Nsn2H8X/10XcqXnh08ZdJ7wJ3WY6NBK+SwvCbpmx88U8qrIdYkJ3qKrmct2upjOCgYbi3LxbNGWDXfJNCZx887cX9BoLVWDjTFhI9XyPRWszHD3GZQ8ffGFNQ4rfzfrItSL1LB7NeFuhd/jijvKMU2pKlHN6QJYMn4v8f2xDFb7pRjUsXp9c602udk2se1cowqhmQI+DhB51A9aQTaWn+6q7ha26b/jwT5YhCsaelofP/oi37tSXnSFsGk6TInzYzmU0OFkIcqKY5OC94iRepKGnp8qmHz1d+sHE4HbUznUCS+oSPR/G4Y41o9C1558V/HLn1jSIhXi/0V3UxUy/S4bJQakN9YHXoaiZvcI9RtKMfd3Zx4tNWV4nQDwkzufI08n4Fvn2LLOyCU9j8sofCxj1f/WKKGwNLDuYr6dbnA7YKBBwvuFykoW5sPgLPGXKvmGAJS7mveIf3bxW416u9d694BC4s4Su9zfsLYff6+5B7JajFfPbFKKho9/pxoXu9Ri8+9XzptUL3GhzyBFzheHkUbIr38woFzDO66Mr1V9hcxuZ9QuUDqgt9QsKW1PUiNjtCrFiAONRxFrzJ+58WsiJSGMSefD54rtOzrc2uk9ae1edPJYMttjsUq2YWnadH2GkdU4X3DFx9fE/3t1QOHv/awaOZdU/OdrJ6C/Jn8HUzVblbVn1RKG6F48caurH28p7bjy2vGXd2+/4v7lILf9ZE319NDBEVRubpNSdfWTlZgjKnyL26KriFDwKFz+HZri2Bg5MvuaLH3IoOr0eBKk3gfVHYdsp7yNvwcTY24ZRtCF8pzvr4x+GcILJ4iY29zrvx2JSDF1O0br1TDmV5Q50UC3cdFUVHyA1VRgEMD7uhWGXv3VCVY8m40kjejwixMjYpZHsEVc1nl0dBRbqh2OQCNxSrohczXJ8DA2E3FBqCoD2EIheFbHYWFx2oBa+gjLuG5CtWUqIKcSLl2kBaqqrcuuL8ujvOs9NkI5Cdh28y5yMTlnHib+X99AImeIrhXJwFebnECS0Ifgvv59yUH0MeLcCzLo+0pTlbX6FldNOS/fStTlxtbr3n3WOsPpLZhBadWXaQPLwUElo4PvW8n3sd5cRALzTziSt4f0eBci7rvXKuwcF1fCWHRYvDylkfYihBreWzl0RBRSvnyqByuus14Xrr+TrLeb8sjMWaEBYE9Ud8dioKKhqLtcFC3WMv+jthFl+oynF+Bext6T17MUMTknylSt5PDBO2KUQYQdXy2YkoqGjCNhfa/gZ6kfYMfUOh7btD2NIxSsy7LSYHiv4nxijsIRAg0KjrGCOddvETkoXs2RaUXt1+7tDNTtmsMfy3n+xzsgRz+WlT7tJtOeoa9NKDxy898K09Uxm1KwxGHDbyjfEuvOvYoHVq+g6NFYbNA07mvn565kUnteAH4sRw7ToBC49KYhlbGBjAHgcNQSiAiDrb5Wjw284RyQ+PrPvvS99z8FjMyDMCNOdCg7YwNMxXFvz54Rop+u4bKjqbjHPv8VLamzhSi33dS6Cvd6RG3f1siJ0ZxfZF5x7+w1aIYmEi/cpIJOLjdr9a4ug2bB7GprOnmBDDXC32kLNGbB8tRG/aryP8b5HwsbFcVGIJ7xAWAjFRd6A3rIdgj+0h5j7wccrNZgV/3rusAH/Mjoj1OI4BKzbvupEYZyzsXZD9S1qTdHipjy0pxpa/7hVbVtJKJ7y9G3oXj7ZTcMD2lAfb1Msosp08KWH5bK+w3EzLPO/tdPfNuvUXbsKtg7st838xiKcTYyO+X+Tf1Uqpl+Tj/3HnjPIevl0cXfBtM4d75ujgfqOObrhAH+S4l7eDGoV+2Zyq+u9sfc/FhilnFdKCQSxHMojAl/D4AJHGHy8TIROJKEhQh/lPla6XouaZU63033dEG+frwQ+usAjMsS/B09Jv58xefub85HP8jq7HUyEP4tTR1Wt3X53LPtHqK6nirl246UAoAFmIIxzwm7PKHldz1ipeNfV/Bn2vdJL7lRE2o3w1WIC6Ss8TyvkeLiACX6unpceX/OTTc+3bXwVxQ3XrijvVIUudcib49QT/OiS4QKew56GX9g67D6htFUoVq8XMWTZ+eF4qOQU54iOyEGUwQ/k3QG56wQc1gZUDn9OczRnHjxdP2sSE8KXwRWkAzLtYjG07vK6x5PNN7ic1kYZJ7Cqn8/wXSdGYKf07n1BGR3FDHL7+wBbGkmbW+I2qJk3/1yE9K/+/b1sqvKYxAAA=";
    public static interface login$LoginClosure$_split_0
      extends fabric.lang.Object {
        public sif.servlet.SessionPrincipal get$sessionPrincipal();
        
        public sif.servlet.SessionPrincipal set$sessionPrincipal(
          sif.servlet.SessionPrincipal val);
        
        public fabric.lang.Object $initLabels();
        
        public login.LoginClosure get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements login$LoginClosure$_split_0 {
            public sif.servlet.SessionPrincipal get$sessionPrincipal() {
                return ((login.LoginClosure.login$LoginClosure$_split_0._Impl)
                          fetch()).get$sessionPrincipal();
            }
            
            public sif.servlet.SessionPrincipal set$sessionPrincipal(
              sif.servlet.SessionPrincipal val) {
                return ((login.LoginClosure.login$LoginClosure$_split_0._Impl)
                          fetch()).set$sessionPrincipal(val);
            }
            
            public login.LoginClosure get$$root() {
                return ((login.LoginClosure.login$LoginClosure$_split_0._Impl)
                          fetch()).get$$root();
            }
            
            public _Proxy(login$LoginClosure$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements login$LoginClosure$_split_0 {
            public sif.servlet.SessionPrincipal get$sessionPrincipal() {
                return this.sessionPrincipal;
            }
            
            public sif.servlet.SessionPrincipal set$sessionPrincipal(
              sif.servlet.SessionPrincipal val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.sessionPrincipal = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            private sif.servlet.SessionPrincipal sessionPrincipal;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          this.$getStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                this.$getStore(),
                                this.get$$root().get$jif$login_LoginClosure_P(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.topInteg()));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (login$LoginClosure$_split_0) this.$getProxy();
            }
            
            public login.LoginClosure get$$root() { return this.$root; }
            
            private login.LoginClosure $root;
            
            public _Impl(fabric.worker.Store $location,
                         login.LoginClosure root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new login.LoginClosure.login$LoginClosure$_split_0.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.sessionPrincipal, refTypes, out,
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
                this.sessionPrincipal =
                  (sif.servlet.SessionPrincipal)
                    $readRef(sif.servlet.SessionPrincipal._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.$root = (login.LoginClosure)
                               $readRef(login.LoginClosure._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                login.LoginClosure.login$LoginClosure$_split_0._Impl src =
                  (login.LoginClosure.login$LoginClosure$_split_0._Impl) other;
                this.sessionPrincipal = src.sessionPrincipal;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy extends fabric.lang.Object._Proxy
              implements login.LoginClosure.login$LoginClosure$_split_0._Static
            {
                public _Proxy(login.LoginClosure.login$LoginClosure$_split_0.
                                _Static._Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final login.LoginClosure.
                  login$LoginClosure$_split_0._Static $instance;
                
                static {
                    login.
                      LoginClosure.
                      login$LoginClosure$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (login.
                        LoginClosure.
                        login$LoginClosure$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          login.LoginClosure.login$LoginClosure$_split_0.
                            _Static._Impl.class);
                    $instance =
                      (login.LoginClosure.login$LoginClosure$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl extends fabric.lang.Object._Impl
              implements login.LoginClosure.login$LoginClosure$_split_0._Static
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
                    return new login.LoginClosure.login$LoginClosure$_split_0.
                             _Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 89, 24, -23, 32,
        23, -19, -121, 85, 96, -114, -107, 53, 108, -62, -126, 8, 43, 98, -126,
        0, 17, -80, 113, 37, 75, -35, 91, -54, 80, 36, -36, -38 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1509330207000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public login.LoginClosure.login$LoginClosure$_split_0
      get$login$LoginClosure$_split_0();
    
    public login.LoginClosure.login$LoginClosure$_split_0
      set$login$LoginClosure$_split_0(
      login.LoginClosure.login$LoginClosure$_split_0 val);
    
    public java.lang.Object invoke_remote(
      final fabric.lang.security.Principal worker$principal);
    
    public fabric.lang.security.Principal get$jif$login_LoginClosure_P();
    
    public fabric.lang.security.Principal
      get$jif$fabric_lang_security_Closure_P();
    
    public fabric.lang.security.Principal
      set$jif$fabric_lang_security_Closure_P(
      fabric.lang.security.Principal val);
    
    public fabric.lang.security.Principal jif$getfabric_lang_security_Closure_P(
      );
    
    public fabric.lang.security.Label get$jif$fabric_lang_security_Closure_L();
    
    public fabric.lang.security.Label set$jif$fabric_lang_security_Closure_L(
      fabric.lang.security.Label val);
    
    public fabric.lang.security.Label jif$getfabric_lang_security_Closure_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements login.LoginClosure {
        public login.LoginClosure.login$LoginClosure$_split_0
          get$login$LoginClosure$_split_0() {
            return ((login.LoginClosure._Impl) fetch()).
              get$login$LoginClosure$_split_0();
        }
        
        public login.LoginClosure.login$LoginClosure$_split_0
          set$login$LoginClosure$_split_0(
          login.LoginClosure.login$LoginClosure$_split_0 val) {
            return ((login.LoginClosure._Impl) fetch()).
              set$login$LoginClosure$_split_0(val);
        }
        
        public fabric.lang.security.Principal get$jif$login_LoginClosure_P() {
            return ((login.LoginClosure._Impl) fetch()).
              get$jif$login_LoginClosure_P();
        }
        
        public fabric.lang.security.Principal
          get$jif$fabric_lang_security_Closure_P() {
            return ((login.LoginClosure._Impl) fetch()).
              get$jif$fabric_lang_security_Closure_P();
        }
        
        public fabric.lang.security.Principal
          set$jif$fabric_lang_security_Closure_P(
          fabric.lang.security.Principal val) {
            return ((login.LoginClosure._Impl) fetch()).
              set$jif$fabric_lang_security_Closure_P(val);
        }
        
        public fabric.lang.security.Label
          get$jif$fabric_lang_security_Closure_L() {
            return ((login.LoginClosure._Impl) fetch()).
              get$jif$fabric_lang_security_Closure_L();
        }
        
        public fabric.lang.security.Label
          set$jif$fabric_lang_security_Closure_L(
          fabric.lang.security.Label val) {
            return ((login.LoginClosure._Impl) fetch()).
              set$jif$fabric_lang_security_Closure_L(val);
        }
        
        public login.LoginClosure login$LoginClosure$(
          sif.servlet.SessionPrincipal arg1) {
            return ((login.LoginClosure) fetch()).login$LoginClosure$(arg1);
        }
        
        public final java.lang.Object invoke() {
            return ((login.LoginClosure) fetch()).invoke();
        }
        
        public final java.lang.Object invoke_remote(
          fabric.lang.security.Principal arg1) {
            return ((login.LoginClosure) fetch()).invoke_remote(arg1);
        }
        
        public static final java.lang.Class[] $paramTypes14 = null;
        
        public java.lang.Object invoke$remote(
          final fabric.worker.remote.RemoteWorker $remoteWorker,
          fabric.lang.security.Principal arg1) {
            if ($remoteWorker ==
                  fabric.worker.Worker.getWorker().getLocalWorker())
                return invoke();
            else
                try {
                    return (java.lang.Object)
                             $remoteWorker.issueRemoteCall(this, "invoke",
                                                           $paramTypes14, null);
                }
                catch (fabric.worker.remote.RemoteCallException $e) {
                    java.lang.Throwable $t = $e.getCause();
                    throw new fabric.common.exceptions.InternalError($e);
                }
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return login.LoginClosure._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static login.LoginClosure jif$cast$login_LoginClosure(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return login.LoginClosure._Impl.jif$cast$login_LoginClosure(arg1,
                                                                        arg2);
        }
        
        public final fabric.lang.security.Principal
          jif$getfabric_lang_security_Closure_P() {
            return ((login.LoginClosure) fetch()).
              jif$getfabric_lang_security_Closure_P();
        }
        
        public final fabric.lang.security.Label
          jif$getfabric_lang_security_Closure_L() {
            return ((login.LoginClosure) fetch()).
              jif$getfabric_lang_security_Closure_L();
        }
        
        public _Proxy(LoginClosure._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements login.LoginClosure {
        public login.LoginClosure login$LoginClosure$(
          final sif.servlet.SessionPrincipal sessionPrincipal) {
            ((login.LoginClosure._Impl) this.fetch()).jif$init();
            {
                {
                    this.get$login$LoginClosure$_split_0().set$sessionPrincipal(
                                                             sessionPrincipal);
                }
                this.fabric$lang$Object$();
            }
            return (login.LoginClosure) this.$getProxy();
        }
        
        public final java.lang.Object invoke() {
            try {
                final fabric.lang.security.DelegatingPrincipal u =
                  fabric.lang.security.DelegatingPrincipal._Impl.
                  jif$cast$fabric_lang_security_DelegatingPrincipal(
                    this.get$jif$login_LoginClosure_P());
                if (!fabric.lang.Object._Proxy.idEquals(u, null) &&
                      fabric.lang.security.PrincipalUtil._Impl.
                      actsFor(u.fetch().$getStore().getPrincipal(), u)) {
                    final fabric.lang.security.DelegatingPrincipal sp =
                      this.get$login$LoginClosure$_split_0().
                      get$sessionPrincipal();
                    if (fabric.lang.security.LabelUtil._Impl.
                          relabelsTo(
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        u,
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.topInteg(
                                                                         )),
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        sp.fetch().$getStore().getPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.topInteg(
                                                                         )))) {
                        u.addDelegatesTo(sp);
                    }
                }
                return null;
            }
            catch (java.lang.NullPointerException exc$4) {
                throw new fabric.common.exceptions.ApplicationError(exc$4);
            }
        }
        
        public login.LoginClosure.login$LoginClosure$_split_0
          get$login$LoginClosure$_split_0() {
            return this.login$LoginClosure$_split_0;
        }
        
        public login.LoginClosure.login$LoginClosure$_split_0
          set$login$LoginClosure$_split_0(
          login.LoginClosure.login$LoginClosure$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.login$LoginClosure$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public login$LoginClosure$_split_0 login$LoginClosure$_split_0;
        
        public final java.lang.Object invoke_remote(
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
                                this.get$jif$login_LoginClosure_P(),
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
                  fabric.lang.security.PrincipalUtil._Impl.
                  actsFor(worker$principal,
                          this.get$jif$login_LoginClosure_P()))
                return this.invoke();
            else
                throw new fabric.worker.remote.RemoteCallLabelCheckFailedException(
                        );
        }
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Principal jif$P) {
            super($location);
            this.jif$login_LoginClosure_P = jif$P;
        }
        
        private void jif$init() {
            this.set$login$LoginClosure$_split_0(
                   (login$LoginClosure$_split_0)
                     new login.LoginClosure.login$LoginClosure$_split_0._Impl(
                       this.$getStore(),
                       (login.LoginClosure) this.$getProxy()).$getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Principal jif$P,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            jif$P,
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof login.LoginClosure) {
                login.LoginClosure c = (login.LoginClosure)
                                         fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.PrincipalUtil._Impl.
                  equivalentTo(c.get$jif$login_LoginClosure_P(), jif$P);
            }
            return false;
        }
        
        public static login.LoginClosure jif$cast$login_LoginClosure(
          final fabric.lang.security.Principal jif$P,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (login.LoginClosure._Impl.jif$Instanceof(jif$P, o))
                return (login.LoginClosure)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal get$jif$login_LoginClosure_P() {
            return this.jif$login_LoginClosure_P;
        }
        
        private fabric.lang.security.Principal jif$login_LoginClosure_P;
        
        public fabric.lang.security.Principal
          get$jif$fabric_lang_security_Closure_P() {
            fabric.worker.transaction.TransactionManager.getInstance().
              registerRead(this);
            return this.jif$fabric_lang_security_Closure_P;
        }
        
        public fabric.lang.security.Principal
          set$jif$fabric_lang_security_Closure_P(
          fabric.lang.security.Principal val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.jif$fabric_lang_security_Closure_P = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        private fabric.lang.security.Principal
          jif$fabric_lang_security_Closure_P;
        
        public final fabric.lang.security.Principal
          jif$getfabric_lang_security_Closure_P() {
            if (fabric.lang.Object._Proxy.
                  idEquals(this.get$jif$fabric_lang_security_Closure_P(), null))
                this.set$jif$fabric_lang_security_Closure_P(
                       this.get$jif$login_LoginClosure_P());
            return this.get$jif$fabric_lang_security_Closure_P();
        }
        
        public fabric.lang.security.Label
          get$jif$fabric_lang_security_Closure_L() {
            fabric.worker.transaction.TransactionManager.getInstance().
              registerRead(this);
            return this.jif$fabric_lang_security_Closure_L;
        }
        
        public fabric.lang.security.Label
          set$jif$fabric_lang_security_Closure_L(
          fabric.lang.security.Label val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.jif$fabric_lang_security_Closure_L = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        private fabric.lang.security.Label jif$fabric_lang_security_Closure_L;
        
        public final fabric.lang.security.Label
          jif$getfabric_lang_security_Closure_L() {
            if (fabric.lang.Object._Proxy.
                  idEquals(this.get$jif$fabric_lang_security_Closure_L(), null))
                this.
                  set$jif$fabric_lang_security_Closure_L(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          fabric.worker.Worker.getWorker().getLocalStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                fabric.worker.Worker.getWorker().getLocalStore(
                                                                   ),
                                this.get$jif$login_LoginClosure_P(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.topInteg()));
            return this.get$jif$fabric_lang_security_Closure_L();
        }
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.get$jif$login_LoginClosure_P(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()));
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.get$jif$login_LoginClosure_P(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (login.LoginClosure) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$login$LoginClosure$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new login.LoginClosure._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.login$LoginClosure$_split_0, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$login_LoginClosure_P, refTypes, out,
                      intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$fabric_lang_security_Closure_P,
                      refTypes, out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$fabric_lang_security_Closure_L,
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
            this.login$LoginClosure$_split_0 =
              (login.LoginClosure.login$LoginClosure$_split_0)
                $readRef(
                  login.LoginClosure.login$LoginClosure$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
            this.jif$login_LoginClosure_P =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$fabric_lang_security_Closure_P =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$fabric_lang_security_Closure_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            login.LoginClosure._Impl src = (login.LoginClosure._Impl) other;
            this.login$LoginClosure$_split_0 = src.login$LoginClosure$_split_0;
            this.jif$login_LoginClosure_P = src.jif$login_LoginClosure_P;
            this.jif$fabric_lang_security_Closure_P =
              src.jif$fabric_lang_security_Closure_P;
            this.jif$fabric_lang_security_Closure_L =
              src.jif$fabric_lang_security_Closure_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements login.LoginClosure._Static {
            public fabric.worker.Worker get$worker$() {
                return ((login.LoginClosure._Static._Impl) fetch()).get$worker$(
                                                                      );
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((login.LoginClosure._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((login.LoginClosure._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((login.LoginClosure._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(login.LoginClosure._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final login.LoginClosure._Static $instance;
            
            static {
                login.
                  LoginClosure.
                  _Static.
                  _Impl
                  impl =
                  (login.LoginClosure._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(login.LoginClosure._Static._Impl.class);
                $instance = (login.LoginClosure._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements login.LoginClosure._Static {
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
                return new login.LoginClosure._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm152 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled155 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff153 = 1;
                        boolean $doBackoff154 = true;
                        $label148: for (boolean $commit149 = false; !$commit149;
                                        ) {
                            if ($backoffEnabled155) {
                                if ($doBackoff154) {
                                    if ($backoff153 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff153);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e150) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff153 < 5000) $backoff153 *= 2;
                                }
                                $doBackoff154 = $backoff153 <= 32 ||
                                                  !$doBackoff154;
                            }
                            $commit149 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e150) {
                                $commit149 = false;
                                continue $label148;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e150) {
                                $commit149 = false;
                                fabric.common.TransactionID $currentTid151 =
                                  $tm152.getCurrentTid();
                                if ($e150.tid.isDescendantOf($currentTid151))
                                    continue $label148;
                                if ($currentTid151.parent != null) throw $e150;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e150) {
                                $commit149 = false;
                                if ($tm152.checkForStaleObjects())
                                    continue $label148;
                                throw new fabric.worker.AbortException($e150);
                            }
                            finally {
                                if ($commit149) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e150) {
                                        $commit149 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e150) {
                                        $commit149 = false;
                                        fabric.common.TransactionID
                                          $currentTid151 =
                                          $tm152.getCurrentTid();
                                        if ($currentTid151 != null) {
                                            if ($e150.tid.equals(
                                                            $currentTid151) ||
                                                  !$e150.tid.
                                                  isDescendantOf(
                                                    $currentTid151)) {
                                                throw $e150;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit149) {
                                    {  }
                                    continue $label148;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 12, -4, 101, -5, 69,
    92, -28, -51, -90, 57, 41, -82, 33, -70, 57, 2, -104, -26, 15, -86, -42, 84,
    -73, -62, 52, -5, 114, -24, -36, 15, 120, -29 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1509330207000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}

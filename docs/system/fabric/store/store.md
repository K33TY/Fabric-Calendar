# Store Classes

+ [DuplicateStoreException](#DuplicateStoreException)
+ [InProcessStore](#InProcessStoreInProcessStore)
+ [Node](#Node)
+ [Options](#Options)
+ [package-info](#package-info)
+ [PrepareRequest](#PrepareRequest)
+ [SessionAttributes](#SessionAttributes)
+ [SimpleSurrogateManager](#SimpleSurrogateManager)
+ [Store](#Store)
+ [SubscriptionManager](#SubscriptionManager)
+ [SurrogateManager](#SurrogateManager)
+ [TransactionManager](#TransactionManager)

## DuplicateStoreException

Is thrown when attempt is made to add a duplicate store to a store node.

#### Public Member Functions

```java
DuplicateStoreException()
```

Inherits from: 
+ fabric.common.exceptions.UsageError

-----

## InProcessStore

In-process implementation of the Store interface for use when a worker is running in-process with a Store. 
The operations work directly on the Store's TransactionManager object.

#### Public Member Functions

Constructor:
```java
InProcessStore (String name, Store c)
```

Notify the store that the transaction tid is being Aborted with possible AccessException:
```java
void abortTransaction (TransactionID tid)
```

Notify the Store that the transaction tid should be committed throwing TransactionCommitFailedException 
and possibly UnreachableNodeException:
```java
void commitTransaction (long transactionID) throws TransactionCommitFailedException
```

Obtain a new, unused object number from the Store:
```java 
long createOnum ()
```

Notifies the store that the transaction is entering the Prepare phase:
```java
void prepareTransaction (long tid, boolean singleStore, boolean readOnly, Collection< _Impl > toCreate, LongKeyMap< Integer > reads, Collection< _Impl > writes) throws TransactionPrepareFailedException
```

```java 
ObjectGroup readObjectFromStore (long onum) throws AccessException
```

```java
ObjectGlob	readEncryptedObjectFromStore (long onum) throws AccessException 
```

#### Protected Attributes

```java
final TransactionManager tm
 
final SurrogateManager sm
 
RemoteIdentity<RemoteWorker> localWorkerIdentity
```

Inherits from: 
+ fabric.worker.RemoteStore
+ fabric.net.RemoteNode<This>
+ fabric.worker.Store

-----

## Node



-----

## Options

## package-info

## PrepareRequest

## SessionAttributes

## SimpleSurrogateManager

## Store

## SubscriptionManager

## SurrogateManager

## TransactionManager
package forcomp
import Anagrams._
object tesst {
sentenceAnagrams(List("Yes", "man"))              //> res0: List[forcomp.Anagrams.Sentence] = List(List(my, en, as), List(my, as, e
                                                  //| n), List(my, sane), List(my, Sean), List(yes, man), List(en, my, as), List(en
                                                  //| , as, my), List(men, say), List(as, my, en), List(as, en, my), List(say, men)
                                                  //| , List(man, yes), List(sane, my), List(Sean, my))

val cc= wordOccurrences("aacdcsdcdsaa")           //> cc  : forcomp.Anagrams.Occurrences = List((a,4), (c,3), (d,3), (s,2))
dictionaryByOccurrences                           //> res1: Map[forcomp.Anagrams.Occurrences,List[forcomp.Anagrams.Word]] = Map(Li
                                                  //| st((e,1), (i,1), (l,1), (r,1), (t,2)) -> List(litter), List((a,1), (d,1), (e
                                                  //| ,1), (g,2), (l,1), (r,1)) -> List(gargled), List((a,1), (e,1), (h,1), (i,1),
                                                  //|  (k,1), (n,1), (s,3)) -> List(shakiness), List((e,2), (g,1), (n,1)) -> List(
                                                  //| gene), List((a,2), (n,1), (t,1), (y,1)) -> List(Tanya), List((a,1), (d,1), (
                                                  //| e,2), (h,1), (m,1), (n,2), (o,1), (s,3)) -> List(handsomeness), List((a,2), 
                                                  //| (c,1), (e,2), (k,1), (l,1), (m,1), (p,1), (r,1), (t,1)) -> List(marketplace)
                                                  //| , List((a,1), (i,1), (l,2), (s,1), (v,1)) -> List(villas), List((d,2), (e,1)
                                                  //| , (h,2), (n,1), (r,1), (t,1), (u,1)) -> List(hundredth), List((a,3), (b,1), 
                                                  //| (c,1), (h,1), (i,2), (l,1), (o,1), (p,2), (r,1), (t,1), (y,1)) -> List(appro
                                                  //| achability), List((d,1), (e,2), (l,1), (s,1), (t,2)) -> List(settled), List(
                                                  //| (a,1), (g,1), (i,3), (l,1), (n,2), (t,1), (z,1)) -> List(Latinizing), List((
                                                  //| a,1), (m,1), (n,1), (o,3
                                                  //| Output exceeds cutoff limit.
wordAnagrams("eat")                               //> res2: List[forcomp.Anagrams.Word] = List(ate, eat, tea)

val list=List(('a',3),('b',2))                    //> list  : List[(Char, Int)] = List((a,3), (b,2))
list.map(x=>(x._1,x._2+1)).toList                 //> res3: List[(Char, Int)] = List((a,4), (b,3))
combinations(list)                                //> res4: List[forcomp.Anagrams.Occurrences] = List(List(), List((b,1)), List((b
                                                  //| ,2)), List((a,1)), List((a,1), (b,1)), List((a,1), (b,2)), List((a,2)), List
                                                  //| ((a,2), (b,1)), List((a,2), (b,2)), List((a,3)), List((a,3), (b,1)), List((a
                                                  //| ,3), (b,2)))
def fct(list:List[(Char,Int)]):List[List[(Char,Int)]]=list match{
case Nil =>List(Nil)
case x::xs=>for{
cc<-(0 to x._2).map((x._1,_)).toList
re<-fct(xs)
}yield (cc::re).filterNot(w=>w._2==0)
}                                                 //> fct: (list: List[(Char, Int)])List[List[(Char, Int)]]
fct(list)                                         //> res5: List[List[(Char, Int)]] = List(List(), List((b,1)), List((b,2)), List(
                                                  //| (a,1)), List((a,1), (b,1)), List((a,1), (b,2)), List((a,2)), List((a,2), (b,
                                                  //| 1)), List((a,2), (b,2)), List((a,3)), List((a,3), (b,1)), List((a,3), (b,2))
                                                  //| )
val a=List(('a',3),('c',2),('d',2))               //> a  : List[(Char, Int)] = List((a,3), (c,2), (d,2))
val b=List(('d',1))                               //> b  : List[(Char, Int)] = List((d,1))
val xs =(a:::b)                                   //> xs  : List[(Char, Int)] = List((a,3), (c,2), (d,2), (d,1))
 def subtract(xs: Occurrences, ys: Occurrences): Occurrences =
    xs.map(x => ys.find(_._1 == x._1) match {
      case Some(y) => (x._1, x._2 - y._2)
      case None => x
    }).filter(_._2 != 0).sortWith(_._2<_._2)      //> subtract: (xs: forcomp.Anagrams.Occurrences, ys: forcomp.Anagrams.Occurrence
                                                  //| s)forcomp.Anagrams.Occurrences

subtract(a,b)                                     //> res6: forcomp.Anagrams.Occurrences = List((d,1), (c,2), (a,3))
val c =Vector(1,2,3)                              //> c  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)


val ch="hello world"                              //> ch  : String = hello world
ch flatMap(x=>List('.',x))                        //> res7: String = .h.e.l.l.o. .w.o.r.l.d
 
 
 (1 to 4) flatMap(x=>(1 to 6) map(y=>(x,y)))      //> res8: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (1,5), (1,6), (2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (3,
                                                  //| 1), (3,2), (3,3), (3,4), (3,5), (3,6), (4,1), (4,2), (4,3), (4,4), (4,5), (4
                                                  //| ,6))
 
 def produitScalaire(xs:Vector[Double],ys:Vector[Double]):Double={
 (xs zip ys).map(xy=>xy._1*xy._2).sum
 }                                                //> produitScalaire: (xs: Vector[Double], ys: Vector[Double])Double
 //produit scalaire version avec for
 
 def produitScalaireFor(xs:List[Double],ys:List[Double]):Double= (for((x,y) <- xs zip ys )yield (x*y)).sum
                                                  //> produitScalaireFor: (xs: List[Double], ys: List[Double])Double

 
 produitScalaireFor(List(1,3,4),List(2,2,2))      //> res9: Double = 16.0
 
 //with pattern matching
 def produitScalaire2(xs:Vector[Double],ys:Vector[Double]):Double={
 (xs zip ys).map{case(x,y)=>x*y}.sum
 
 
 }                                                //> produitScalaire2: (xs: Vector[Double], ys: Vector[Double])Double
 
 produitScalaire2(Vector(1,3,4),Vector(2,2,2))    //> res10: Double = 16.0
 


def isPrime(x:Int):Boolean= (2 until x) forall (p=>x%p!=0)
                                                  //> isPrime: (x: Int)Boolean
isPrime(1)                                        //> res11: Boolean = true
 
 val n=7                                          //> n  : Int = 7
((1 until n) flatMap (i=>
(1 until i) map (j =>(i,j)))) filter(pair=> isPrime(pair._1+pair._2))
                                                  //> res12: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5))

 
}
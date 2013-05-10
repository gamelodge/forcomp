package forcomp
import Anagrams._
object tesst {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); val res$0 = 
sentenceAnagrams(List("Yes", "man"));System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0));$skip(41); 

val cc= wordOccurrences("aacdcsdcdsaa");System.out.println("""cc  : forcomp.Anagrams.Occurrences = """ + $show(cc ));$skip(24); val res$1 = 
dictionaryByOccurrences;System.out.println("""res1: Map[forcomp.Anagrams.Occurrences,List[forcomp.Anagrams.Word]] = """ + $show(res$1));$skip(20); val res$2 = 
wordAnagrams("eat");System.out.println("""res2: List[forcomp.Anagrams.Word] = """ + $show(res$2));$skip(32); 

val list=List(('a',3),('b',2));System.out.println("""list  : List[(Char, Int)] = """ + $show(list ));$skip(34); val res$3 = 
list.map(x=>(x._1,x._2+1)).toList;System.out.println("""res3: List[(Char, Int)] = """ + $show(res$3));$skip(19); val res$4 = 
combinations(list);System.out.println("""res4: List[forcomp.Anagrams.Occurrences] = """ + $show(res$4));$skip(193); 
def fct(list:List[(Char,Int)]):List[List[(Char,Int)]]=list match{
case Nil =>List(Nil)
case x::xs=>for{
cc<-(0 to x._2).map((x._1,_)).toList
re<-fct(xs)
}yield (cc::re).filterNot(w=>w._2==0)
};System.out.println("""fct: (list: List[(Char, Int)])List[List[(Char, Int)]]""");$skip(10); val res$5 = 
fct(list);System.out.println("""res5: List[List[(Char, Int)]] = """ + $show(res$5));$skip(36); 
val a=List(('a',3),('c',2),('d',2));System.out.println("""a  : List[(Char, Int)] = """ + $show(a ));$skip(20); 
val b=List(('d',1));System.out.println("""b  : List[(Char, Int)] = """ + $show(b ));$skip(16); 
val xs =(a:::b);System.out.println("""xs  : List[(Char, Int)] = """ + $show(xs ));$skip(217); 
 def subtract(xs: Occurrences, ys: Occurrences): Occurrences =
    xs.map(x => ys.find(_._1 == x._1) match {
      case Some(y) => (x._1, x._2 - y._2)
      case None => x
    }).filter(_._2 != 0).sortWith(_._2<_._2);System.out.println("""subtract: (xs: forcomp.Anagrams.Occurrences, ys: forcomp.Anagrams.Occurrences)forcomp.Anagrams.Occurrences""");$skip(15); val res$6 = 

subtract(a,b);System.out.println("""res6: forcomp.Anagrams.Occurrences = """ + $show(res$6));$skip(21); 
val c =Vector(1,2,3);System.out.println("""c  : scala.collection.immutable.Vector[Int] = """ + $show(c ));$skip(23); 


val ch="hello world";System.out.println("""ch  : String = """ + $show(ch ));$skip(27); val res$7 = 
ch flatMap(x=>List('.',x));System.out.println("""res7: String = """ + $show(res$7));$skip(49); val res$8 = 
 
 
 (1 to 4) flatMap(x=>(1 to 6) map(y=>(x,y)));System.out.println("""res8: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$8));$skip(110); 
 
 def produitScalaire(xs:Vector[Double],ys:Vector[Double]):Double={
 (xs zip ys).map(xy=>xy._1*xy._2).sum
 };System.out.println("""produitScalaire: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(146); 
 //produit scalaire version avec for
 
 def produitScalaireFor(xs:List[Double],ys:List[Double]):Double= (for((x,y) <- xs zip ys )yield (x*y)).sum;System.out.println("""produitScalaireFor: (xs: List[Double], ys: List[Double])Double""");$skip(48); val res$9 = 

 
 produitScalaireFor(List(1,3,4),List(2,2,2));System.out.println("""res9: Double = """ + $show(res$9));$skip(139); 
 
 //with pattern matching
 def produitScalaire2(xs:Vector[Double],ys:Vector[Double]):Double={
 (xs zip ys).map{case(x,y)=>x*y}.sum
 
 
 };System.out.println("""produitScalaire2: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(49); val res$10 = 
 
 produitScalaire2(Vector(1,3,4),Vector(2,2,2));System.out.println("""res10: Double = """ + $show(res$10));$skip(63); 
 


def isPrime(x:Int):Boolean= (2 until x) forall (p=>x%p!=0);System.out.println("""isPrime: (x: Int)Boolean""");$skip(11); val res$11 = 
isPrime(1);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(11); 
 
 val n=7;System.out.println("""n  : Int = """ + $show(n ));$skip(96); val res$12 = 
((1 until n) flatMap (i=>
(1 until i) map (j =>(i,j)))) filter(pair=> isPrime(pair._1+pair._2));System.out.println("""res12: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$12))}

 
}

package forcomp
import Anagrams._
object mytest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
val word="meTanoTe";System.out.println("""word  : String = """ + $show(word ));$skip(47); 

def f(c:Char):Char={
if (c=='a') 'e' else c
};System.out.println("""f: (c: Char)Char""");$skip(41); val res$0 = 
word.toLowerCase.toList.groupBy(x=>f(x));System.out.println("""res0: scala.collection.immutable.Map[Char,List[Char]] = """ + $show(res$0));$skip(30); 

val s=List("abdbd","ccccaa");System.out.println("""s  : List[String] = """ + $show(s ));$skip(20); val res$1 = 
s.reduceRight(_++_);System.out.println("""res1: String = """ + $show(res$1));$skip(20); 
val z=List(('c',3));System.out.println("""z  : List[(Char, Int)] = """ + $show(z ));$skip(13); 
val x=z.head;System.out.println("""x  : (Char, Int) = """ + $show(x ));$skip(57); 
val aux =(0 to x._2).map((x._1,_)).toList.filter(_._2>0);System.out.println("""aux  : List[(Char, Int)] = """ + $show(aux ));$skip(149); 


def sub(a:List[(Char,Int)],b:List[(Char,Int)]):List[(Char,Int)]=a.map(x=>b.find(_._1==x._1) match{
case Some(z)=>(x._1,x._2-z._2)
case None =>x
});System.out.println("""sub: (a: List[(Char, Int)], b: List[(Char, Int)])List[(Char, Int)]""");$skip(33); val res$2 = 
sub(List(('c',3)),List(('c',1)));System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2))}
}

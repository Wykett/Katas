from Counting import Counting

#Test counting for url
counting = Counting([
	"http://www.google.com/a.txt",
	"http://www.google.com.tw/a.txt",
	"http://www.google.com/download/c.jpg",
	"http://www.google.co.jp/a.txt",
	"http://www.google.com/b.txt",
	"https://facebook.com/movie/b.txt",
	"http://yahoo.com/123/000/c.jpg",
	"http://gliacloud.com/haha.png"])

result = counting.count()
print (result)
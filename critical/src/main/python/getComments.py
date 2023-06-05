import requests
from bs4 import BeautifulSoup
import sys
a=sys.argv[1]
address=f"https://movie.douban.com/subject/{a}/comments?start=0&limit=20&status=P&sort=new_score"
print(address)
def getComments(address):
    headers={
        "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/113.0"
    }

    for start in range(0, 200, 20):
        response = requests.get(
        address, headers=headers)
        html = response.text
        soup = BeautifulSoup(html, "html.parser")
        all_comments = soup.findAll("span", attrs={"class": "short"})
        for comments in all_comments:
            print(comments.string + "\n")
getComments(address)


# response=requests.get("https://movie.douban.com/top250",headers=headers)
# https://movie.douban.com/subject/1292052/comments?sort=new_score&status=P
# response=requests.get("https://movie.douban.com/subject/1292052/comments?start=20&limit=20&status=P&sort=new_score",headers=headers)
# html=response.text
# soup=BeautifulSoup(html,"html.parser")
# print(html)
# all_titles=soup.findAll("span",attrs={"class": "title"})
# for title in all_titles:
#     print(title.string)


# for start in range(0,200,20):
#     response = requests.get(
#         "https://movie.douban.com/subject/1292052/comments?start=20&limit=20&status=P&sort=new_score", headers=headers)
#     html = response.text
#     soup = BeautifulSoup(html, "html.parser")
#     all_comments = soup.findAll("span", attrs={"class": "short"})
#     for comments in all_comments:
#         print(comments.string + "\n")


# for start_num in range(0,250,25):
#     print(start_num)



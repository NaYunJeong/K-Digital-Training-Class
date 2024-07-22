# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# 가수, 노래 제목을 직접 입력해서 요청
# 노래 가사에 대한 내용을 출력

# https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8
# &query=%EC%9D%B4%EB%AC%B4%EC%A7%84+%EC%9E%A0%EA%B9%90%EC%8B%9C%EA%B0%84%EB%90%A0%EA%B9%8C+%EA%B0%80%EC%82%AC

artist = quote(input("artist : "))
title = quote(input("title : "))

url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8"
url += f"&query={artist}+{title}+%EA%B0%80%EC%82%AC"
# 띄어쓰기 => +

response = requests.get(url)

if response.status_code == 200:
    html = response.text
    # print(html)
    soup = BeautifulSoup(html, 'html.parser')
    lyrics = soup.select_one("#main_pack > div.sc_new.cs_common_simple._au_music_content_wrap.case_rel.color_16 > div.cm_content_wrap > div > div > div.detail_info._sap_item > div.text_expand.text_center._ellipsis > span")
    print(lyrics.text)
    
else:
    print(response.status_code)

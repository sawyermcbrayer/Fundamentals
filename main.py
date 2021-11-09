import os
from selenium import webdriver
import time
import requests
import pytest
from selenium.webdriver.common.keys import Keys

def test_wiki0():
    dir = os.path.dirname(__file__)
    chrome_driver_path = dir + '\chromedriver.exe'
    # create session
    driver = webdriver.Chrome(chrome_driver_path)
    driver.implicitly_wait(30)
    driver.maximize_window()

    # Navigate to the application home page
    driver.get("https://en.wikepedia.org")
    # get the search textbox
    search_field = driver.find_element_by_name("search")
    # enter search keyword and submit
    search_field.send_keys("wake tech")
    search_field.submit()
    testVar = driver.title
    time.sleep(3)
    driver.quit()
    assert "Wake Technical Community College" in testVar

test_wiki0()
毕业设计：基于AR技术的购物及比价工具的实现
---
Implementation of shopping and price comparison tools based on AR technology


### 进度参考
* 1月份，在谷歌学术等平台，查阅相关文献，研究其他AR
购物产品和图像识别检测商品的产品，查找合适的英文文献，查找有关实现根据图片在
各电商平台搜索商品的API。
* 2月份，完成英文文献的翻译。
* 3月15日前，调研和学习有关深度学习图像识别和检测的模型，确定最终使用的
模型，将该模型整合到APP中，测试运行结果。
* 3月15日至4月15日，完成电商平台API整合到APP中，完成中期答辩。
* 4月中旬到4月底，完成AR显示部分任务，整体测试APP，并完成调试。
* 5月初至5月中旬，完成毕业论文，查重。


### 进度报告

#### 2020.03.05
完成了《where to buy it》参考文献的翻译<br>
学习了R-CNN、Fast R-CNN、Faster R-CNN、SSD、YOLO之间的差别，主要参考
[目标检测（Object Detection）入门概要](https://blog.csdn.net/f290131665/article/details/81012556) <br>
在GitHub上找到了三个使用Fast R-CNN模型的代码 <br>
待解决问题：<br>
运行Android-Object-Detection工程，在手机上调试时，AS未报错，但是APP获取图片之后出现闪退的问题

#### 2020.03.06
用了一天的时间重新学习了移动应用开发的知识 <br>
**待解决问题：** <br>
Android-Object-Detection工程在手机运行闪退问题 <br>
***(新问题)*** 如何将unity3D上的代码和AS上的代码整合

#### 2020.03.09
闪退原因是因为原来的caffe用不了，这几天看了官网上caffe的介绍和使用，win10系统下需要安装hyper-V或使用Linux系统，但我电脑通过hyper-V安装虚拟机有问题，所以，如果用caffe的话，打算用阿里云服务器试试。

#### 2020.03.15
用2天时间，学习了linux操作系统相关知识，主要参考
[linux] (http://linux.vbird.org/linux_basic/0410accountmanager.php#sudo) <br>
用2天时间，在B站学习了tensorflow框架的知识和使用方法 <br>
用3天时间，在服务器配置好了Mask RCNN模型所需要的环境，并安装好了Mask RCNN模型，成功运行了项目给的demo，中间因为tensorflow版本和cuda版本不匹配导致的依赖库链接丢失问题花费了比较长时间 <br>
**待解决问题** <br>
将Mask_RCNN模型运用到AS工程中 <br>
**接下来计划** <br>
实现Mask_RCNN模型运用到AS工程中 <br>
试用万邦提供的新的电商以图搜图的API(如果有时间) <br>

#### 2020.03.23
完成了pycharm的安装，并远程调试<br>
学习了tensorflow lite相关的知识<br>
成功运行了tensorflow给的Android demo，阅读了其中的代码<br>
将模型和权重保存成h5文件失败了<br>
**待解决问题**<br>
将模型和权重保存，并转换成tflite的文件格式<br>
这几天尝试了将自己写的模型导出成h5文件和转换tflite文件，结果没有生成这些文件，在终端和pycharm上都运行了代码，但在根目录下全局搜索都未找到本应该生成的文件。并且，把同一份代码在Linux环境、tensorflow版本都一致的情况下运行，生成了h5文件并成功转换成了tflite文件。目前很懵逼，为什么会这样，代码在pycharm上运行和终端运行的时候都没有报错。<br>
**接下来计划**<br>
打算再挣扎一会通过h5文件生成tflite的方法，如果不行考虑GraphDef和CheckPoint生成tflite的方法。


package com.witaless.newsapiclient.presenter

import com.witaless.newsapiclient.view.MvpView

interface MvpPresenter<V : MvpView> {

    fun attachView(mvpView: V)

    fun viewIsReady()

    fun detachView()

    fun destroy()

}
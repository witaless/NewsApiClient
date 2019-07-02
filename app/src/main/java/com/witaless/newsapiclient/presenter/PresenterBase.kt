package com.witaless.newsapiclient.presenter

import com.witaless.newsapiclient.view.MvpView

abstract class PresenterBase<T : MvpView> : MvpPresenter<T> {
    private var view: T? = null

    override fun attachView(mvpView: T) {
        view = mvpView
    }

    override fun detachView() {
        view = null
    }

    fun getView(): T? = view

    protected fun isViewAttached(): Boolean = view != null

    override fun destroy() {

    }
}
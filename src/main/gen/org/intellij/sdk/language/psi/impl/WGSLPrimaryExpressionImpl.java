// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static wgslplugin.language.psi.WGSLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class WGSLPrimaryExpressionImpl extends ASTWrapperPsiElement implements WGSLPrimaryExpression {

  public WGSLPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WGSLArgumentExpressionList getArgumentExpressionList() {
    return findChildByClass(WGSLArgumentExpressionList.class);
  }

  @Override
  @Nullable
  public WGSLConstLiteral getConstLiteral() {
    return findChildByClass(WGSLConstLiteral.class);
  }

  @Override
  @Nullable
  public WGSLParenExpression getParenExpression() {
    return findChildByClass(WGSLParenExpression.class);
  }

  @Override
  @Nullable
  public WGSLTypeDecl getTypeDecl() {
    return findChildByClass(WGSLTypeDecl.class);
  }

}

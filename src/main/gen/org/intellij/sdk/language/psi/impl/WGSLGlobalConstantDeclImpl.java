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

public class WGSLGlobalConstantDeclImpl extends ASTWrapperPsiElement implements WGSLGlobalConstantDecl {

  public WGSLGlobalConstantDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitGlobalConstantDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WGSLAttributeList> getAttributeListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WGSLAttributeList.class);
  }

  @Override
  @Nullable
  public WGSLGlobalConstInitializer getGlobalConstInitializer() {
    return findChildByClass(WGSLGlobalConstInitializer.class);
  }

  @Override
  @Nullable
  public WGSLVariableIdentDecl getVariableIdentDecl() {
    return findChildByClass(WGSLVariableIdentDecl.class);
  }

}
